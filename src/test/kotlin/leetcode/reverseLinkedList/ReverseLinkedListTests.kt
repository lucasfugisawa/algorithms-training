package leetcode.reverseLinkedList

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReverseLinkedListTests  {

    @Test
    fun testReverseList_Case1() {
        // Arrange
        val head = createLinkedList(1, 2, 3, 4, 5)
        val expected = createLinkedList(5, 4, 3, 2, 1)

        // Act
        val solution = Solution()
        val result = solution.reverseList(head)

        // Assert
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testReverseList_Case2() {
        // Arrange
        val head = createLinkedList(1, 2)
        val expected = createLinkedList(2, 1)

        // Act
        val solution = Solution()
        val result = solution.reverseList(head)

        // Assert
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testReverseList_Case3() {
        // Arrange
        val head: ListNode? = null
        val expected: ListNode? = null

        // Act
        val solution = Solution()
        val result = solution.reverseList(head)

        // Assert
        assertLinkedListEquals(expected, result)
    }

    // Helper function to create a linked list from an array of values
    private fun createLinkedList(vararg values: Int): ListNode? {
        var head: ListNode? = null
        var tail: ListNode? = null

        for (value in values) {
            val node = ListNode(value)

            if (head == null) {
                head = node
                tail = node
            } else {
                tail?.next = node
                tail = tail?.next
            }
        }

        return head
    }

    // Helper function to assert if two linked lists are equal
    private fun assertLinkedListEquals(expected: ListNode?, actual: ListNode?) {
        var expectedNode = expected
        var actualNode = actual

        while (expectedNode != null && actualNode != null) {
            assertEquals(expectedNode.`val`, actualNode.`val`)
            expectedNode = expectedNode.next
            actualNode = actualNode.next
        }

        assertEquals(expectedNode, actualNode)
    }
}