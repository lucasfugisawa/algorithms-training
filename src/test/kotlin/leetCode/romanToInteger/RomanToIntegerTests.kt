package leetCode.romanToInteger

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RomanToIntegerTests {

    @Test
    fun testRomanToInt_Case1() {
        // Arrange
        val input = "III"
        val expectedOutput = 3

        // Act
        val solution = Solution()
        val result = solution.romanToInt(input)

        // Assert
        assertEquals(expectedOutput, result)
    }

    @Test
    fun testRomanToInt_Case2() {
        // Arrange
        val input = "LVIII"
        val expectedOutput = 58

        // Act
        val solution = Solution()
        val result = solution.romanToInt(input)

        // Assert
        assertEquals(expectedOutput, result)
    }

    @Test
    fun testRomanToInt_Case3() {
        // Arrange
        val input = "MCMXCIV"
        val expectedOutput = 1994

        // Act
        val solution = Solution()
        val result = solution.romanToInt(input)

        // Assert
        assertEquals(expectedOutput, result)
    }
}