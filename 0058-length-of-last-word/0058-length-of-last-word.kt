class Solution {
    fun lengthOfLastWord(s: String): Int {
        val word = s.trim()
        var i = word.length - 1

        while (i >= 0 && word.get(i) != ' ')
            i--
        
        return word.length - i - 1
    }
}