package leetcode.zigzagConversion

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ZigzagConversionTests {
    @Test
    fun testConvert_Case1() {
        // Arrange
        val input = "PAYPALISHIRING"
        val numRows = 3
        val expected = "PAHNAPLSIIGYIR"

        // Act
        val solution = Solution()
        val result = solution.convert(input, numRows)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testConvert_Case2() {
        // Arrange
        val input = "PAYPALISHIRING"
        val numRows = 4
        val expected = "PINALSIGYAHRPI"

        // Act
        val solution = Solution()
        val result = solution.convert(input, numRows)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testConvert_Case3() {
        // Arrange
        val input = "A"
        val numRows = 1
        val expected = "A"

        // Act
        val solution = Solution()
        val result = solution.convert(input, numRows)

        // Assert
        assertEquals(expected, result)
    }
}