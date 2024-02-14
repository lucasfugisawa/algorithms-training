package leetCode.romanToInteger

class Solution {
    fun romanToInt(s: String): Int = s
        .reversed()
        .map(::romanDigitToInt)
        .reduce(::romanNumeralValue)

    private fun romanDigitToInt(character: Char) = when (character) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }

    private fun romanNumeralValue(accumulator: Int, number: Int) =
        accumulator + number * (if (4 * number < accumulator) -1 else 1)
}


