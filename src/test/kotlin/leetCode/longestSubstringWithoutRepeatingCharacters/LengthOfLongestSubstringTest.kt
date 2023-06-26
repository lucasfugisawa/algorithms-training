package leetCode.longestSubstringWithoutRepeatingCharacters

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LengthOfLongestSubstringTest {

    @Test
    fun testLengthOfLongestSubstring_Case1() {
        // Arrange
        val s = "abcabcbb"
        val expected = 3

        // Act
        val solution = Solution()
        val result = solution.lengthOfLongestSubstring(s)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testLengthOfLongestSubstring_Case2() {
        // Arrange
        val s = "bbbbb"
        val expected = 1

        // Act
        val solution = Solution()
        val result = solution.lengthOfLongestSubstring(s)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testLengthOfLongestSubstring_Case3() {
        // Arrange
        val s = "pwwkew"
        val expected = 3

        // Act
        val solution = Solution()
        val result = solution.lengthOfLongestSubstring(s)

        // Assert
        assertEquals(expected, result)
    }
}