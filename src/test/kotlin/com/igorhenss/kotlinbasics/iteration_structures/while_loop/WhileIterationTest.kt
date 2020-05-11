package com.igorhenss.kotlinbasics.iteration_structures.while_loop

import org.junit.jupiter.api.Test

internal class WhileIterationTest {

    private val iterator = WhileIteration()

    @Test
    fun shouldReduceIntToZeroUsingWhile() {
        iterator.reduceToZeroUsingWhile(-1)
        iterator.reduceToZeroUsingWhile(0)
        iterator.reduceToZeroUsingWhile(1)
        iterator.reduceToZeroUsingWhile(2)
        iterator.reduceToZeroUsingWhile(3)
    }

    @Test
    fun shouldReduceIntToZeroUsingDoWhile() {
        iterator.reduceToZeroUsingDoWhile(-1)
        iterator.reduceToZeroUsingDoWhile(0)
        iterator.reduceToZeroUsingDoWhile(1)
        iterator.reduceToZeroUsingDoWhile(2)
        iterator.reduceToZeroUsingDoWhile(3)
    }

}