package com.igorhenss.kotlinbasics.iteration_structures.while_loop

class WhileIteration {

    fun reduceToZeroUsingWhile(n: Int) {
        var x = n
        println("Iterating from $n to 0 using while")
        while(x > 0) {
            print("[${x}] ")
            x--
        }
        println()
    }

    fun reduceToZeroUsingDoWhile(n: Int) {
        var x = n
        println("Iterating from $n to 0 using do...while")
        do {
            print("[${x}] ")
            x--
        } while(x > 0)
        println()
    }

}