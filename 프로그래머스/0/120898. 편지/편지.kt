class Solution {
    fun solution(message: String): Int {
        var answer: Int = 0
    
        for(i in message.indices){
            answer++
        }
        
        return answer*2
    }
}