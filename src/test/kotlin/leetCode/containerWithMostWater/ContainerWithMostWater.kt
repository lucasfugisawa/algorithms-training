package leetCode.containerWithMostWater

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ContainerWithMostWater {

    private val solution = Solution()

    @Test
    fun `test maxArea with input 1,8,6,2,5,4,8,3,7`() {
        // Arrange
        val heights = intArrayOf(1,8,6,2,5,4,8,3,7)
        val expected = 49

        // Act
        val result = solution.maxArea(heights)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun `test maxArea with input 1,1`() {
        // Arrange
        val heights = intArrayOf(1, 1)
        val expected = 1

        // Act
        val result = solution.maxArea(heights)

        // Assert
        assertEquals(expected, result)
    }
}