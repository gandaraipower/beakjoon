class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var x=1
        var count=1
        while(count!=0){
            
        if(n%x==1){
            count=0
            answer=x
        }
        else
            x++
        }
        return answer
    }
}