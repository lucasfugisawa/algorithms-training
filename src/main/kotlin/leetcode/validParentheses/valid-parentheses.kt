package leetcode.validParentheses

class Solution {

    fun isValid(s: String): Boolean {

        val pairs = mapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}'
        )
        val stack = mutableListOf<Char>()

        for (c in s) {
            if (pairs.containsKey(c)) stack.add(c)
            else {
                val top = stack.removeAt(stack.lastIndex) // stack.removeLast() in latest Kotlin
                if (pairs[top] != c) return false
            }
        }
        return stack.isEmpty()
    }
}