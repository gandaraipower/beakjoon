class Solution {
    fun solution(n: Int): String {
        var answer = StringBuilder()
        var k=0
        while(n!=k){
            if(k%2==0)
                answer.append("수")
            else
                answer.append("박")
            k++
        }
        return answer.toString()
    }
}