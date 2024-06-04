class Solution {
    fun solution(arr: IntArray): Double {
        var sum:Double=0.0
        var answer:Double=0.0
        var count:Double=0.0
        for(i in arr)
        {
            val x=i.toDouble()
            sum+=x
            count++
        }
        answer=sum/count
        return answer
    }
}