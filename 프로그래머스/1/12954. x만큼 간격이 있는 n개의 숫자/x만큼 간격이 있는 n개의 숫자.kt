class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n) //LongArray에는 Int값이 들어감
        for(i in 1 .. answer.size)
        {
            if(x<0)
            {
                
            }
            var y=i.toLong()*x.toLong()           
            answer[i-1]=y      
        }
        
        return answer
    }
}