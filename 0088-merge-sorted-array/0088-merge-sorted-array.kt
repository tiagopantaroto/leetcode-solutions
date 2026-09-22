class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        if (n != 0) {
            if (m == 0) {
                for (i in 0..<n)
                    nums1[i] = nums2[i]
            } else {
                val arrayAux = arrayListOf<Int>()
                var cont1 = 0
                var cont2 = 0
                while (cont1 < m && cont2 < n) {
                    if (nums1[cont1] <= nums2[cont2]) {
                        arrayAux.add(nums1[cont1++])
                    } else {
                        arrayAux.add(nums2[cont2++])
                    }

                }
                while (cont1 < m)
                    arrayAux.add(nums1[cont1++])

                while (cont2 < n)
                    arrayAux.add(nums2[cont2++])

                
                for (i in 0..<(m + n))
                    nums1[i] = arrayAux[i];
            }
        }
    }
}