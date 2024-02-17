package leetCode.reverseInteger

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun `test reverse for positive numbers`() {
        // Arrange
        val solution = Solution()

        // Act
        val result = solution.reverse(123)

        // Assert
        assertEquals(321, result)
    }

    @Test
    fun `test reverse for negative numbers`() {
        // Arrange
        val solution = Solution()

        // Act
        val result = solution.reverse(-123)

        // Assert
        assertEquals(-321, result)
    }

    @Test
    fun `test reverse for zero ending numbers`() {
        // Arrange
        val solution = Solution()

        // Act
        val result = solution.reverse(120)

        // Assert
        assertEquals(21, result)
    }
}