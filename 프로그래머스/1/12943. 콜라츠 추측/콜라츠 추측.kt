class Solution {
    fun solution(num: Int): Long {
        var answer = 0
        var x:Long=num.toLong()
        var count:Long=0
        if(x==1L)
            return 0
        while(x!=1L){
            if(count>=500L)
                return -1
            if(x%2L==0L)
                x/=2
            else
                x=x*3+1
            count++
        }
        
        return count
    }
}