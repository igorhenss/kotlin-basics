package com.igorhenss.kotlinbasics.comparison_structures

import java.math.BigDecimal

class WhenComparison {

    fun whenComparisonParityAndSign(value: Number) {
        when(value.toInt() % 2) {
            0 -> println("[$value] is even.")
            else -> println("[$value] is odd.")
        }
        when(value) {
            0 -> println("[$value] is not positive nor negative.")
            else -> if (value.toDouble() > 0) println("[$value] is positive.") else println("[$value] is negative.")
        }
    }

    fun whenComparisonClassType(value: Any) {
        when(value) {
            is BigDecimal -> println("[$value] is a BigDecimal.")
            is Char -> println("[\'$value\'] is a Char.")
            is Double -> println("[$value] is a Double.")
            is Int -> println("[$value] is an Int.")
            is String -> println("[\"$value\"] is a String.")
            else -> println("[$value]'s class is: ${value::class.java.simpleName}")
        }
        if (value is Number) whenComparisonParityAndSign(value)

        println()
    }

}