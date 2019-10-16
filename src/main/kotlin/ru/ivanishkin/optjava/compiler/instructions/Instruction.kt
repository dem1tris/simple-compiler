package ru.ivanishkin.optjava.compiler.instructions

import org.objectweb.asm.MethodVisitor

interface Instruction {
    fun apply(visitor: MethodVisitor)
}