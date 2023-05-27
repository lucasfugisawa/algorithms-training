package leetcode.zigzagConversion

import java.util.*
import java.util.stream.Collectors

internal class Solution {

    fun convert(s: String, numRows: Int): String {
        if (numRows < 2) return s
        val zigzagBufferSize = 2 * (numRows - 1)
        val zigzagBuffer = arrayOfNulls<StringBuilder>(zigzagBufferSize)
        for (i in 0 until zigzagBufferSize) {
            zigzagBuffer[i] = if (i < numRows) StringBuilder() else zigzagBuffer[zigzagBuffer.size - i]
        }
        for (i in 0 until s.length) {
            zigzagBuffer[zigzagBufferSize - (zigzagBufferSize - i % zigzagBufferSize)]!!.append(s[i])
        }
        return Arrays.stream(zigzagBuffer)
            .limit(numRows.toLong())
            .map { obj: StringBuilder? -> obj.toString() }
            .collect(Collectors.joining())
    }
}