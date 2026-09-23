class Solution {
    fun recoverOrder(order: IntArray, friends: IntArray): IntArray {
        val result = mutableListOf<Int>()

        for(participante in order) {
            if(participante >= friends.get(0) && participante <= friends.get(friends.size - 1)) {
                if(friends.contains(participante)) result.add(participante)
            }
        }
        
        return result.toIntArray()
    }
}