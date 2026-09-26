class Solution {
    fun findWords(words: Array<String>): Array<String> {
            val result = mutableListOf<String>()
            if (words.isNotEmpty()) {
                val firstRow = "qwertyuiop".toCharArray()
                val secondRow = "asdfghjkl".toCharArray()
                val thirdRow = "zxcvbnm".toCharArray()


                for (word in words) {
                    var whichRowIsIt = -1
                    var whichRowWasIt = -1
                    var sameRow = true
                    for (c in word.lowercase()) {
                        whichRowIsIt = when (c) {
                            in firstRow -> 1
                            in secondRow -> 2
                            in thirdRow -> 3
                            else -> 0
                        }
                        if (whichRowWasIt == -1)
                            whichRowWasIt = whichRowIsIt
                        else if (whichRowWasIt != whichRowIsIt) {
                            sameRow = false
                            break
                        }
                    }

                    if (sameRow)
                        result.add(word)


                }
            }
            return result.toTypedArray()
        }
}