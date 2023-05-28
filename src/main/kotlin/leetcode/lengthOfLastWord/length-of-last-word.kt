package leetcode.lengthOfLastWord

class Solution {
    fun lengthOfLastWord(s: String): Int {
        var len = 0
        for (i in s.length - 1 downTo 0) {
            if (s[i] != ' ') len++
            else if (len > 0) return len
        }
        return len
    }
}
