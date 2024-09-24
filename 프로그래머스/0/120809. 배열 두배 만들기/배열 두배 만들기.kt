class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        
        for(i in numbers.indices){
            answer.add(numbers[i]*2)
        }
        return answer.toIntArray()
    }
}