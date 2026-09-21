class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var cont = 0
        while (cont < nums.size && nums[cont] < target)
            cont++

        return cont++
    }
}