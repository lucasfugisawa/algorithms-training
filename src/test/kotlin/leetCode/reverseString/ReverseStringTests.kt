package leetCode.reverseString

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReverseStringTests {

    @Test
    fun testReverseString_Case1() {
        // Arrange
        val s = charArrayOf('h', 'e', 'l', 'l', 'o')
        val expected = charArrayOf('o', 'l', 'l', 'e', 'h')

        // Act
        val solution = Solution()
        solution.reverseString(s)

        // Assert
        assertArrayEquals(expected, s)
    }

    @Test
    fun testReverseString_Case2() {
        // Arrange
        val s = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
        val expected = charArrayOf('h', 'a', 'n', 'n', 'a', 'H')

        // Act
        val solution = Solution()
        solution.reverseString(s)

        // Assert
        assertArrayEquals(expected, s)
    }
}