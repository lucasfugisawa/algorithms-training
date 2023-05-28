package leetCode.twoSum

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoSumTest {
    @Test
    fun testTwoSum_Case1() {
        // Arrange
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(0, 1)

        // Act
        val solution = Solution()
        val result = solution.twoSum(nums, target)

        // Assert
        assertArrayEquals(expected, result)
    }

    @Test
    fun testTwoSum_Case2() {
        // Arrange
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val expected = intArrayOf(1, 2)

        // Act
        val solution = Solution()
        val result = solution.twoSum(nums, target)

        // Assert
        assertArrayEquals(expected, result)
    }

    @Test
    fun testTwoSum_Case3() {
        // Arrange
        val nums = intArrayOf(3, 3)
        val target = 6
        val expected = intArrayOf(0, 1)

        // Act
        val solution = Solution()
        val result = solution.twoSum(nums, target)

        // Assert
        assertArrayEquals(expected, result)
    }
}