import java.lang.Math.pow

class Solution {
    fun digitFrequencyScore(n: Int): Int {
        val nString = n.toString()
        val map = mutableMapOf<Char, Int>()


        for (c in nString) {
            if (map.containsKey(c))
                map[c] = map.getValue(c) + 1
            else
                map.put(c, 1)
        }

        var result = 0
        for((key, value) in map) {
            result +=  (key.digitToInt() * value)
        }

        return result

    }

}