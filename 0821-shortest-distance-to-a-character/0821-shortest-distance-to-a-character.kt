class Solution {
fun shortestToChar(s: String, c: Char): IntArray {
        val answer = mutableListOf<Int>()
        val positions = mutableListOf<Int>()

        for ((index, ch) in s.withIndex()) {
            answer.add(index)
            if (ch == c)
                positions.add(index)


        }

        for ((index, elementoAtual) in answer.withIndex()) {
            var minDist = -1
            var dist = -1
            for (i in positions) {
                dist = abs(elementoAtual - i)
                if (minDist == -1 || dist < minDist)
                    minDist = dist

            }

            answer[index] = minDist

        }

        return answer.toIntArray()

    }
}