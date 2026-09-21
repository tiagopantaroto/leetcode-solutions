import kotlin.math.pow

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n == 1 || n == 2)
            return true
        else if (n == 0 || n % 2 != 0)
            return false
        else {
            for (i in 2..30) {
                if (n == 2.0.pow(i).toInt()) return true
            }
            return false
        }
    }
    }
