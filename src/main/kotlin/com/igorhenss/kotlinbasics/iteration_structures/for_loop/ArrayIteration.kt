package com.igorhenss.kotlinbasics.iteration_structures.for_loop

class ArrayIteration {

    // Can iterate through List<E> and Collection<E> as well
    // When using Collection<E>, array[index] won't work

    fun arrayIteration(array: Array<Any>) {
        println("Iterating through array:")
        for(element in array) {
            print("[$element] ")
        }
        println()
        println()
    }

    fun arrayIterationWithIndex(array: Array<Any>) {
        println("Iterating through array with array.withIndex:")
        for((index, element) in array.withIndex()) {
            print("($index, $element) ")
        }
        println()
        println()
    }

    fun arrayIterationWithIndices(array: Array<Any>) {
        println("Iterating through array with array.indices:")
        for(index in array.indices) {
            print("($index, ${array[index]}) ")
        }
        println()
        println()
    }

}