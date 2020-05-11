package com.igorhenss.kotlinbasics.comparison_structures

import org.junit.jupiter.api.Test
import java.math.BigDecimal

internal class WhenComparisonTest {

    private val comparator = WhenComparison()

    @Test
    fun shouldPrintClassType() {
        comparator.whenComparisonClassType(-1.0)
        comparator.whenComparisonClassType(0)
        comparator.whenComparisonClassType(BigDecimal.ONE)
        comparator.whenComparisonClassType("0123456789")
        comparator.whenComparisonClassType('0')
        comparator.whenComparisonClassType(Object())
    }

    @Test
    fun shouldPrintNumbersParityAndSign() {
        comparator.whenComparisonParityAndSign(-1.0)
        comparator.whenComparisonParityAndSign(0)
        comparator.whenComparisonParityAndSign(BigDecimal.ONE)
    }

}