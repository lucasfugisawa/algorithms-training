package leetCode.longestSubstringWithoutRepeatingCharacters

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var i = 0
        var j = 0
        var max = 0
        val chars = mutableSetOf<Char>()

        while (j < s.length) {
            if (s[j] !in chars) {
                chars.add(s[j++])
                max = Math.max(max, chars.size)
            } else {
                chars.remove(s[i++])
            }
        }
        return max
    }
}
