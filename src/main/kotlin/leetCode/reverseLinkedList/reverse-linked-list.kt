package leetCode.reverseLinkedList

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {

    fun reverseList(head: ListNode?): ListNode? {
        var currentNode: ListNode? = head
        var nextNode: ListNode?
        var previousNode: ListNode? = null

        while (currentNode != null) {
            nextNode = currentNode.next
            currentNode.next = previousNode
            previousNode = currentNode
            currentNode = nextNode
        }

        return previousNode
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
