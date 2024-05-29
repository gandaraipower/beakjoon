class Solution {
    fun solution(n: Int): Int {
        var count=0
        for (i in 1 .. n)
        {
            if(n%i==0)
            {
                count+=i
            }
        } 
        var answer = 0
        answer=count
        return answer
    }
}