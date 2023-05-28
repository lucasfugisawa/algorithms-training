package leetCode.lengthOfLastWord

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LengthOfLastWordTests {

    @Test
    fun testLengthOfLastWord_Case1() {
        // Arrange
        val input = "Hello World"
        val expected = 5

        // Act
        val solution = Solution()
        val result = solution.lengthOfLastWord(input)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testLengthOfLastWord_Case2() {
        // Arrange
        val input = "   fly me   to   the moon  "
        val expected = 4

        // Act
        val solution = Solution()
        val result = solution.lengthOfLastWord(input)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testLengthOfLastWord_Case3() {
        // Arrange
        val input = "luffy is still joyboy"
        val expected = 6

        // Act
        val solution = Solution()
        val result = solution.lengthOfLastWord(input)

        // Assert
        assertEquals(expected, result)
    }
}