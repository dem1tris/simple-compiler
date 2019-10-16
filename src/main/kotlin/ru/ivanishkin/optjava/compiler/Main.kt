package ru.ivanishkin.optjava.compiler

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import ru.ivanishkin.optjava.compiler.listener.MyListener

fun main(args: Array<String>) {

    val lexer = SimpleLangLexer(
        CharStreams.fromString(
            """
                int i = 1, b, c = 2
                int k = 2
                while i < k do
                    i = i + 1
                done
                print(i)
            """.trimIndent()
        )
    )
    val tokens = CommonTokenStream(lexer)
    val parser = SimpleLangParser(tokens)
    val walker = ParseTreeWalker()
    val tree = parser.program()
    walker.walk(MyListener(), tree)

}