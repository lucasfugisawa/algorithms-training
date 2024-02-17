package leetCode.reverseInteger

import kotlin.math.abs
import kotlin.math.sign

class Solution {
    fun reverse(x: Int): Int = try {
        abs(x).toString().reversed().toInt() * x.sign
    } catch (_: NumberFormatException) {
        0
    }
}