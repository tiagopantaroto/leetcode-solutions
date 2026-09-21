class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var size = 0
        var index = -1
        var i = 0

        while (i < haystack.length) {
            if (needle.get(size) == haystack.get(i)) {
                if (size == 0) index = i
                size++

            } else {
                if (size != 0) {
                    i = index
                }

                size = 0

            }

            i++

            if (needle.length == size) return index
        }

        return -1
    }
}