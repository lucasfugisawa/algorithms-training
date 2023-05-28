package leetCode.addTwoNumbers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddTwoNumbersTest {

    @Test
    fun testAddTwoNumbers_Case1() {
        // Arrange
        val l1 = createLinkedList(2, 4, 3)
        val l2 = createLinkedList(5, 6, 4)
        val expected = createLinkedList(7, 0, 8)

        // Act
        val solution = Solution()
        val result = solution.addTwoNumbers(l1, l2)

        // Assert
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testAddTwoNumbers_Case2() {
        // Arrange
        val l1 = createLinkedList(0)
        val l2 = createLinkedList(0)
        val expected = createLinkedList(0)

        // Act
        val solution = Solution()
        val result = solution.addTwoNumbers(l1, l2)

        // Assert
        assertLinkedListEquals(expected, result)
    }

    @Test
    fun testAddTwoNumbers_Case3() {
        // Arrange
        val l1 = createLinkedList(9, 9, 9, 9, 9, 9, 9)
        val l2 = createLinkedList(9, 9, 9, 9)
        val expected = createLinkedList(8, 9, 9, 9, 0, 0, 0, 1)

        // Act
        val solution = Solution()
        val result = solution.addTwoNumbers(l1, l2)

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