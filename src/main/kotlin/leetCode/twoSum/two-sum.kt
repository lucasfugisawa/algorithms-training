package leetCode.twoSum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val presentNumbers = mutableMapOf<Int, Int>()

        nums.withIndex().forEach {
            val complement = target - it.value
            if (complement in presentNumbers.keys)
                return intArrayOf(presentNumbers[complement]!!, it.index)
            presentNumbers[it.value] = it.index
        }

        return intArrayOf()
    }
}