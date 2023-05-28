package leetCode.palindromeNumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PalindromeNumberTests {

    @Test
    fun testIsPalindrome_Case1() {
        // Arrange
        val input = 121
        val expected = true

        // Act
        val solution = Solution()
        val result = solution.isPalindrome(input)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testIsPalindrome_Case2() {
        // Arrange
        val input = -121
        val expected = false

        // Act
        val solution = Solution()
        val result = solution.isPalindrome(input)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testIsPalindrome_Case3() {
        // Arrange
        val input = 10
        val expected = false

        // Act
        val solution = Solution()
        val result = solution.isPalindrome(input)

        // Assert
        assertEquals(expected, result)
    }
}