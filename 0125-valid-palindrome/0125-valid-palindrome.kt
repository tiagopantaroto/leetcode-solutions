class Solution {
    fun isPalindrome(s: String): Boolean {
        val newString = s.lowercase().filter { n -> n.isLetterOrDigit() }
        
        return newString == newString.reversed()
    }
}