package com.igorhenss.kotlinbasics.iteration_structures.for_loop

import org.junit.jupiter.api.Test

internal class ArrayIterationTest {

    private val iterator = ArrayIteration()

    @Test
    fun shouldIterateThroughArrayWithoutAnyKindOfIndex() {
        iterator.arrayIteration(arrayOf(1, 2, 3))
        iterator.arrayIteration(arrayOf(4, 5, 6))
        iterator.arrayIteration(arrayOf(7, 8, 9))
    }

    @Test
    fun shouldIterateThroughArrayUsingWithIndexFunction() {
        iterator.arrayIterationWithIndex(arrayOf(1, 2, 3))
        iterator.arrayIterationWithIndex(arrayOf(4, 5, 6))
        iterator.arrayIterationWithIndex(arrayOf(7, 8, 9))
    }

    @Test
    fun shouldIterateThroughArrayUsingIndicesAndArrayDeconstruction() {
        iterator.arrayIterationWithIndices(arrayOf(1, 2, 3))
        iterator.arrayIterationWithIndices(arrayOf(4, 5, 6))
        iterator.arrayIterationWithIndices(arrayOf(7, 8, 9))
    }

}