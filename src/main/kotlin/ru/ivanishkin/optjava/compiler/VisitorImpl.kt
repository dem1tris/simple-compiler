package ru.ivanishkin.optjava.compiler

import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.Label
import org.objectweb.asm.Opcodes.*
import ru.ivanishkin.optjava.compiler.listener.Type
import ru.ivanishkin.optjava.compiler.listener.Var


class VisitorImpl(
    classWriter: ClassVisitor
) : SimpleLangBaseVisitor<Unit>() {
    private val visitor = classWriter.visitMethod(
        ACC_PUBLIC + ACC_STATIC,
        "main",
        "([Ljava/lang/String;)V",
        null,
        null
    )

    private val locals = mutableMapOf<String, Var>()

    override fun visitSimpleExpr(ctx: SimpleLangParser.SimpleExprContext) {
        with(ctx) {
            NAME()?.let {
                visitor.visitVarInsn(ALOAD, locals[it.text]?.index ?: error("Undeclared variable ${it.text}"))
                return
            }
            NUM()?.let {
                visitor.visitLdcInsn(Integer.valueOf(it.text))
                visitor.visitMethodInsn(
                    INVOKESTATIC,
                    "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false
                )
                return
            }
            STRING()?.let {
                visitor.visitLdcInsn(it.text)
            }
        }
    }

    override fun visitBinop(ctx: SimpleLangParser.BinopContext?) {}

    override fun visitExpr(ctx: SimpleLangParser.ExprContext) {
        visitAddExpr(ctx.addExpr(0))
        if (ctx.addExpr().size == 2) {
            unbox()
            visitAddExpr(ctx.addExpr(1))
            unbox()
            visitCompOp(ctx.compOp())
            box()
        }
    }

    override fun visitMulOp(ctx: SimpleLangParser.MulOpContext) {
        when (ctx.text) {
            "*" -> visitor.visitInsn(IMUL)
            "/" -> visitor.visitInsn(IDIV)
            else -> error(ctx.text)
        }
    }

    override fun visitAddOp(ctx: SimpleLangParser.AddOpContext) {
        when (ctx.text) {
            "+" -> visitor.visitInsn(IADD)
            "-" -> visitor.visitInsn(ISUB)
            else -> error(ctx.text)
        }
    }

    override fun visitCompOp(ctx: SimpleLangParser.CompOpContext) {
        val elseLabel = Label()
        val nextLabel = Label()
        when (ctx.text) {
            "<" -> visitor.visitJumpInsn(IF_ICMPGE, elseLabel)
            "<=" -> visitor.visitJumpInsn(IF_ICMPGT, elseLabel)
            ">" -> visitor.visitJumpInsn(IF_ICMPLE, elseLabel)
            ">=" -> visitor.visitJumpInsn(IF_ICMPLT, elseLabel)
            "==" -> visitor.visitJumpInsn(IF_ICMPEQ, elseLabel)
            "!=" -> visitor.visitJumpInsn(IF_ICMPNE, elseLabel)
            else -> error(ctx.text)
        }
        visitor.visitInsn(ICONST_1);
        visitor.visitJumpInsn(GOTO, nextLabel);
        visitor.visitLabel(elseLabel)
        visitor.visitInsn(ICONST_0)
        visitor.visitLabel(nextLabel)
    }

    override fun visitMulExpr(ctx: SimpleLangParser.MulExprContext) {
        if (ctx.simpleExpr() != null) {
            visitSimpleExpr(ctx.simpleExpr())
        } else {
            visitMulExpr(ctx.mulExpr(0))
            unbox()
            visitMulExpr(ctx.mulExpr(1))
            unbox()
            visitMulOp(ctx.mulOp())
            box()
        }
    }

    override fun visitAddExpr(ctx: SimpleLangParser.AddExprContext) {
        if (ctx.mulExpr() != null) {
            visitMulExpr(ctx.mulExpr())
        } else {
            visitAddExpr(ctx.addExpr(0))
            unbox()
            visitAddExpr(ctx.addExpr(1))
            unbox()
            visitAddOp(ctx.addOp())
            box()
        }
    }

    override fun visitAssignment(ctx: SimpleLangParser.AssignmentContext) {
        when (val variable = locals[ctx.NAME().text]) {
            null -> error("Undeclared variable ${ctx.NAME().text}")
            else -> {
                visitExpr(ctx.expr())
                val assignableName = ctx.expr()?.addExpr(0)?.mulExpr()?.simpleExpr()?.NAME()?.text
                val assignableString = ctx.expr()?.addExpr(0)?.mulExpr()?.simpleExpr()?.STRING()?.text
                val exprType = when {
                    assignableName != null -> locals[assignableName]?.type
                    assignableString != null -> Type.STRING
                    else -> Type.INT
                }
                if (variable.type != exprType) {
                    error("Incompatible types")
                }
                visitor.visitVarInsn(ASTORE, variable.index)
            }
        }
    }

    override fun visitDeclElement(ctx: SimpleLangParser.DeclElementContext) =
        ctx.assignment()?.let { visitAssignment(it) }


    override fun visitDecl(ctx: SimpleLangParser.DeclContext) {
        with(ctx) {
            val type = when (TYPE().text) {
                "int" -> Type.INT
                "str" -> Type.STRING
                else -> error("Unknown type")
            }

            declElement().forEach {
                val name = it.NAME()?.text ?: it.assignment()?.NAME()?.text ?: error("decl is not NAME nor assignment")
                val variable = Var(name, type, locals.size)
                check(locals.putIfAbsent(name, variable) == null) { "Duplicated declaration" }
                visitDeclElement(it)
            }
        }
    }

    override fun visitCond(ctx: SimpleLangParser.CondContext) {
        val elseLabel = Label()
        visitExpr(ctx.expr())
        unbox()
        visitor.visitJumpInsn(IFEQ, elseLabel)
        ctx.line().forEach {
            visitLine(it)
        }
        visitor.visitLabel(elseLabel)
    }

    override fun visitLoop(ctx: SimpleLangParser.LoopContext) {
        val compareLabel = Label()
        val nextLabel = Label()
        visitor.visitLabel(compareLabel)
        visitExpr(ctx.expr())
        unbox()
        visitor.visitJumpInsn(IFEQ, nextLabel)
        ctx.line().forEach {
            visitLine(it)
        }
        visitor.visitJumpInsn(GOTO, compareLabel)
        visitor.visitLabel(nextLabel)
    }

    override fun visitPrint(ctx: SimpleLangParser.PrintContext) {
        visitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")
        visitExpr(ctx.expr())
        visitor.visitMethodInsn(
            INVOKEVIRTUAL,
            "java/io/PrintStream",
            "println",
            "(Ljava/lang/Object;)V",
            false
        )
    }

    override fun visitStmt(ctx: SimpleLangParser.StmtContext) {
        with(ctx) {
            decl()?.let { visitDecl(it); return }
            assignment()?.let { visitAssignment(it); return }
            cond()?.let { visitCond(it); return }
            loop()?.let { visitLoop(it); return }
            expr()?.let { visitExpr(it); return }
            print()?.let { visitPrint(it); return }
        }
    }

    override fun visitLine(ctx: SimpleLangParser.LineContext) {
        ctx.stmt()?.let { visitStmt(it) }
    }

    override fun visitProgram(ctx: SimpleLangParser.ProgramContext) {
        visitor.visitCode()
        ctx.line().forEach {
            visitLine(it)
        }
        visitor.visitInsn(RETURN)
        visitor.visitMaxs(0, 0)
        visitor.visitEnd()
    }

    private fun box() = visitor.visitMethodInsn(
        INVOKESTATIC, "java/lang/Integer",
        "valueOf", "(I)Ljava/lang/Integer;", false
    )

    private fun unbox() = visitor.visitMethodInsn(
        INVOKEVIRTUAL, "java/lang/Integer",
        "intValue", "()I", false
    )
}