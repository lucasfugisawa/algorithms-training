package leetcode.singleNumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SingleNumberTests {

    @Test
    fun testSingleNumber_Case1() {
        // Arrange
        val nums = intArrayOf(2, 2, 1)
        val expected = 1

        // Act
        val solution = Solution()
        val result = solution.singleNumber(nums)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testSingleNumber_Case2() {
        // Arrange
        val nums = intArrayOf(4, 1, 2, 1, 2)
        val expected = 4

        // Act
        val solution = Solution()
        val result = solution.singleNumber(nums)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testSingleNumber_Case3() {
        // Arrange
        val nums = intArrayOf(1)
        val expected = 1

        // Act
        val solution = Solution()
        val result = solution.singleNumber(nums)

        // Assert
        assertEquals(expected, result)
    }
}