package ru.ivanishkin.optjava.compiler.instructions

import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.*
import ru.ivanishkin.optjava.compiler.SimpleLangParser.ExprContext
import ru.ivanishkin.optjava.compiler.listener.Type
import ru.ivanishkin.optjava.compiler.listener.Var

class Assign(
    val variable: Var,
    val expr: ExprContext
) : Instruction, Opcodes {
    override fun apply(visitor: MethodVisitor) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class While: Instruction {
    override fun apply(visitor: MethodVisitor) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class If: Instruction {
    override fun apply(visitor: MethodVisitor) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class Print(
    private val variable: Var
): Instruction, Opcodes {
    override fun apply(visitor: MethodVisitor) {
        visitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")
        val (loadOpcode, descriptor) = when (variable.type) {
            Type.INT -> ILOAD to "(I)V"
            Type.STRING -> ALOAD to "(Ljava/lang/String;)V"
        }
        visitor.visitVarInsn(loadOpcode, variable.index)
        visitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", descriptor, false)
    }
}