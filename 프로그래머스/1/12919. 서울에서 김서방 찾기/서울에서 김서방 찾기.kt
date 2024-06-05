class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        var count=0
        for(i in 0 until seoul.size){
            if(seoul[i]=="Kim"){
                 answer="김서방은 ${count}에 있다"
            }
            else
                count++
        }
        return answer
    }
}