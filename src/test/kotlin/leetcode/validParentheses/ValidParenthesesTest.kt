package leetcode.validParentheses

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidParenthesesTest {

    @Test
    fun testIsValid_Case1() {
        // Arrange
        val input = "()"
        val expected = true

        // Act
        val solution = Solution()
        val result = solution.isValid(input)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testIsValid_Case2() {
        // Arrange
        val input = "()[]{}"
        val expected = true

        // Act
        val solution = Solution()
        val result = solution.isValid(input)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testIsValid_Case3() {
        // Arrange
        val input = "(]"
        val expected = false

        // Act
        val solution = Solution()
        val result = solution.isValid(input)

        // Assert
        assertEquals(expected, result)
    }
}