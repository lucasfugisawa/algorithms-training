package leetCode.containerWithMostWater

class Solution {
    fun maxArea(heights: IntArray): Int {
        if (heights.isEmpty()) return 0

        var leftmostLine = 0
        var rightmostLine = heights.size - 1
        var maxCalculatedArea = 0

        while (leftmostLine < rightmostLine) {
            val area = minOf(heights[leftmostLine], heights[rightmostLine]) * (rightmostLine - leftmostLine)
            maxCalculatedArea = maxOf(maxCalculatedArea, area)

            if (heights[leftmostLine] < heights[rightmostLine]) leftmostLine += 1
            else rightmostLine -= 1
        }
        return maxCalculatedArea
    }
}