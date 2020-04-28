package com.igorhenss.kotlinbasics.iteration_structures.for_loop

class RangeIteration {

    fun descendIteration(start: Int, end: Int, spacing: Int? = 1) {
        println("Iterating through: $start downTo $end step $spacing")
        for(i in start downTo end step spacing!!) {
            print("[$i] ")
        }
        println()
    }

    fun ascendIteration(start: Int, end: Int, spacing: Int? = 1) {
        println("Iterating through: $start..$end step $spacing")
        for(i in start..end step spacing!!) {
            print("[$i] ")
        }
        println()
    }

    fun ascendIterationNonInclusive(start: Int, end: Int, spacing: Int? = 1) {
        println("Iterating through: $start until $end step $spacing")
        for(i in start until end step spacing!!) {
            print("[$i] ")
        }
        println()
    }

}