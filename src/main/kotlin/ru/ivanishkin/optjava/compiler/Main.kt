package ru.ivanishkin.optjava.compiler

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.*
import java.io.FileOutputStream

fun main(args: Array<String>) {

//    int i = 1, b, c = 2
//    int k = 2
//    while i < k do
//        i = i + 1
//    done
//    print(i)

    val lexer = SimpleLangLexer(
        CharStreams.fromString(
            """
            int two = 1 + 1
            int a = 10 / 10
            if 5 > 7 then
                print("NO")
            endif
            if 7 > 5 then
                print("YES")
            endif
            while a < 100000000 do
                a = a + 1
            done
            print(two)
            print(a)
            """.trimIndent()
        )
    )
    val tokens = CommonTokenStream(lexer)
    val parser = SimpleLangParser(tokens)

    val className = "SimpleLangMain"
    val classWriter = ClassWriter(ClassWriter.COMPUTE_FRAMES or ClassWriter.COMPUTE_MAXS)
    classWriter.visit(55, ACC_PUBLIC or ACC_SUPER, className, null,
        "java/lang/Object", null)

    val tree = parser.program()
    VisitorImpl(classWriter).visit(tree)
    classWriter.visitEnd()
    FileOutputStream("$className.class").use {
        it.write(classWriter.toByteArray())
    }
}