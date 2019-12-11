package ru.ivanishkin.optjava.compiler.listener

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.TerminalNode
import ru.ivanishkin.optjava.compiler.SimpleLangBaseListener
import ru.ivanishkin.optjava.compiler.SimpleLangParser
import java.util.*

enum class Type {
    INT,
    STRING
}

class Var(
    val name: String,
    val type: Type,
    val index: Int
)

/*
class MyListener : SimpleLangBaseListener() {

    private val locals = mutableMapOf<String, Var>()

    private val instructions = ArrayDeque<Instruction>()

    override fun enterSimpleExpr(ctx: SimpleLangParser.SimpleExprContext?) {
        super.enterSimpleExpr(ctx)
    }

    override fun exitSimpleExpr(ctx: SimpleLangParser.SimpleExprContext?) {
        super.exitSimpleExpr(ctx)
    }

    override fun enterExpr(ctx: SimpleLangParser.ExprContext?) {
        super.enterExpr(ctx)
    }

    override fun exitExpr(ctx: SimpleLangParser.ExprContext?) {
        super.exitExpr(ctx)
    }

    override fun enterAssignment(ctx: SimpleLangParser.AssignmentContext) {
        super.enterAssignment(ctx)
        when (val name = locals[ctx.NAME().text]) {
            null -> error("Undeclared variable ${ctx.NAME().text}")
            else -> {
                instructions.push(Assign(name, ctx.expr()))
                println("Assignment ${ctx.NAME().text} = ${ctx.expr().text}")
            }
        }
    }

    override fun exitAssignment(ctx: SimpleLangParser.AssignmentContext?) {
        super.exitAssignment(ctx)
    }

    override fun enterDecl(ctx: SimpleLangParser.DeclContext) {

    }

    override fun exitDecl(ctx: SimpleLangParser.DeclContext?) {
        super.exitDecl(ctx)
    }

    override fun enterCond(ctx: SimpleLangParser.CondContext?) {
        super.enterCond(ctx)
    }

    override fun exitCond(ctx: SimpleLangParser.CondContext?) {
        super.exitCond(ctx)
    }

    override fun enterLoop(ctx: SimpleLangParser.LoopContext?) {
        super.enterLoop(ctx)
    }

    override fun exitLoop(ctx: SimpleLangParser.LoopContext?) {
        super.exitLoop(ctx)
    }

    override fun enterPrint(ctx: SimpleLangParser.PrintContext?) {
//        instructions.push(Print())
    }

    override fun exitPrint(ctx: SimpleLangParser.PrintContext?) {
        super.exitPrint(ctx)
    }

    override fun enterStmt(ctx: SimpleLangParser.StmtContext?) {
        super.enterStmt(ctx)
    }

    override fun exitStmt(ctx: SimpleLangParser.StmtContext?) {
        super.exitStmt(ctx)
    }

    override fun enterEveryRule(ctx: ParserRuleContext?) {
        super.enterEveryRule(ctx)
    }

    override fun exitEveryRule(ctx: ParserRuleContext?) {
        super.exitEveryRule(ctx)
    }

    override fun visitTerminal(node: TerminalNode?) {
        super.visitTerminal(node)
    }

    override fun visitErrorNode(node: ErrorNode?) {
        super.visitErrorNode(node)
    }
}*/
