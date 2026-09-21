class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {

        val mapOfNums = mutableMapOf<Int, Int>()
        for (n in nums) {
            if (mapOfNums.containsKey(n)) mapOfNums[n] = mapOfNums.getValue(n) + 1
            else mapOfNums.put(n, 1)
        }
        for ((key, value) in mapOfNums)
            if (value >= 2) return true
        return false
    }
}