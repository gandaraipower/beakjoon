class Solution {
    fun solution(s: String): String {
        var answer = StringBuilder()
        var array=s.toCharArray().sorted().reversed()
        
        for(i in array){
            answer.append(i)
        }
        return answer.toString()
    }
}