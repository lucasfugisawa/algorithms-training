package leetcode.singleNumber

class Solution {
    fun singleNumber(nums: IntArray): Int {
        val numsSet = mutableSetOf<Int>()
        nums.forEach { if (it in numsSet) numsSet.remove(it) else numsSet.add(it) }
        return numsSet.first()
    }
}
