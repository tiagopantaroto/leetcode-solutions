class Solution {
    fun singleNumber(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        var value: Int? = 0
        for (i in nums) {

            println("n = $i")
            if (map.contains(i)) {
                value = map[i]
                if (value != null)
                    map[i] = value + 1
                println("Laço 1")
            } else map.put(i, 1)
        }


        return map.filterValues { n -> n == 1 }.keys.elementAt(0)
    }
}