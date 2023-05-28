package leetCode.palindromeNumber

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val xStr = x.toString()
        for (i in 0 .. xStr.lastIndex / 2) {
            if (xStr[i] != xStr[xStr.length - i - 1]) return false
        }
        return true
    }
}