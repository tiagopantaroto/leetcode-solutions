import kotlin.math.sqrt
class Solution {
    fun isUgly(n: Int): Boolean {

        return when {
            n == 1 -> true
            n <= 0 -> false
            else -> {
                var aux = n
                while(aux % 2 == 0)
                    aux = aux / 2

                while(aux % 3 == 0)
                    aux = aux / 3

                while (aux % 5 == 0)
                    aux = aux / 5

                aux == 1
            }
        }

    }
}