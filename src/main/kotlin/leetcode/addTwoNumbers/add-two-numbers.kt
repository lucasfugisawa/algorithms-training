package leetcode.addTwoNumbers

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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        var l1Iter = l1
        var l2Iter = l2

        var newHead: ListNode? = null
        var newTail: ListNode? = null
        var acum = 0

        while (l1Iter != null || l2Iter != null) {
            val sum = (l1Iter?.`val` ?: 0) + (l2Iter?.`val` ?: 0) + acum
            acum = if (sum > 9) 1 else 0
            val node = ListNode(sum - 10*acum)
            if (newHead == null) {
                newHead = node
                newTail = node
            } else {
                newTail?.next = node
                newTail = newTail?.next
            }
            if (l1Iter != null) l1Iter = l1Iter.next
            if (l2Iter != null) l2Iter = l2Iter.next
        }
        if (acum > 0) newTail?.next = ListNode(acum)

        return newHead
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
