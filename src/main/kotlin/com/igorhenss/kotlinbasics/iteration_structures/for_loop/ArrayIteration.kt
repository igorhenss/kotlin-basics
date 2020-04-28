package com.igorhenss.kotlinbasics.iteration_structures.for_loop

class ArrayIteration {

    // Can iterate through List<E> and Collection<E> as well
    // When using Collection<E>, array[index] won't work

    fun <E: Any> arrayIteration(array: Array<E>) {
        println("Iterating through array: [$array]")
        for(element in array) {
            print("[$element] ")
        }
    }

    fun <E: Any> arrayIterationWithIndex(array: Array<E>) {
        println("Iterating through array with array.withIndex: [$array]")
        for((index, element) in array.withIndex()) {
            print("[$index, $element] ")
        }
    }

    fun <E: Any> arrayIterationWithIndices(array: Array<E>) {
        println("Iterating through array with array.indices: [$array]")
        for(index in array.indices) {
            print("[${array[index]}]")
        }
    }

}