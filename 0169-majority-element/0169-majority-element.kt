class Solution {
       fun majorityElement(nums: IntArray): Int {
        val mutableMap = mutableMapOf<Int, Int>()

        for (num in nums) {
            if (mutableMap.containsKey(num)) {
                mutableMap[num] = mutableMap.getValue(num) + 1
            } else mutableMap.put(num, 1)

        }
        
        var majorityElement = nums.get(0)
        var aux = 1
        for((key, value) in mutableMap) {
            if (value > aux) {
                aux = value
                majorityElement = key
            }
        }
        
        return majorityElement

    }
}