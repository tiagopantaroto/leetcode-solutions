class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val answer = mutableListOf<Int>()
        val positions = mutableListOf<Int>()

        for ((index, ch) in s.withIndex()) {
            if (ch == c) {
                positions.add(index)
                answer.add(0)
            } else answer.add(index)


        }

        for ((index, elementoAtual) in answer.withIndex()) {
            var minDist = -1
            var dist = -1
            if(elementoAtual != 0 || index == 0) {
                for (i in positions) {
                    dist = abs(elementoAtual - i)
                    if (minDist == -1 || dist < minDist)
                        minDist = dist
                    else break

                }

                answer[index] = minDist
            }


        }

        return answer.toIntArray()

    }
}