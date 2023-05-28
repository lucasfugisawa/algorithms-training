package leetCode.binaryTreeInorderTraversal

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreeInorderTraversalTests {

    @Test
    fun testInorderTraversal_Case1() {
        // Arrange
        val root = TreeNode(1)
        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)
        val expected = listOf(1, 3, 2)

        // Act
        val solution = Solution()
        val result = solution.inorderTraversal(root)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testInorderTraversal_Case2() {
        // Arrange
        val root: TreeNode? = null
        val expected = emptyList<Int>()

        // Act
        val solution = Solution()
        val result = solution.inorderTraversal(root)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testInorderTraversal_Case3() {
        // Arrange
        val root = TreeNode(1)
        val expected = listOf(1)

        // Act
        val solution = Solution()
        val result = solution.inorderTraversal(root)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testInorderTraversalRecursive_Case1() {
        // Arrange
        val root = TreeNode(1)
        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)
        val expected = listOf(1, 3, 2)

        // Act
        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testInorderTraversalRecursive_Case2() {
        // Arrange
        val root: TreeNode? = null
        val expected = emptyList<Int>()

        // Act
        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun testInorderTraversalRecursive_Case3() {
        // Arrange
        val root = TreeNode(1)
        val expected = listOf(1)

        // Act
        val solution = Solution()
        val result = solution.inorderTraversalRecursive(root)

        // Assert
        assertEquals(expected, result)
    }
}