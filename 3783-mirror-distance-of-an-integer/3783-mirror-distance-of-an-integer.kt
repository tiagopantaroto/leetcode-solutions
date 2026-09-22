class Solution {
    fun reverse(n: Int): Int {
        return n.toString().reversed().dropWhile { it == '0' }.toInt()
    }

    fun mirrorDistance(n: Int): Int {
        val result = n - reverse(n)
        return if (result > 0) result else result * -1
    }
}