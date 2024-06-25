class Solution {
    fun solution(numbers: IntArray): Double {
        var sum=0
        var count=0
        var answer=0.0
        for(i in 0 until numbers.size){
            sum+=numbers[i]
            count++
        }
        answer=sum.toDouble()/count
        return answer
    }
}