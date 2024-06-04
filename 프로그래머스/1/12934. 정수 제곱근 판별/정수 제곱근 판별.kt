class Solution {
    fun solution(n: Long): Long {
        val input=n
        var x:Long =1//얘값을 n마다 설정해줄수만 있으면 되는데   
        var count=1
        var output:Long=0
        var answer: Long = 0
        while(count!=0)
        {
            output=x*x
            if(output==n)
            {
                answer=(x+1)*(x+1)
                count=0
            }
            else
                x++
            if(output>n)
            {
                count=0
                answer=-1
            }
        }
       
        return answer
    }
}