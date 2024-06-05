class Solution {
    fun solution(s: String): String {
        var answer = StringBuilder()
        val array=s.toCharArray()
        
        if(array.size%2==0)
        {
            answer.append(array[array.size/2-1].toString())
            answer.append(array[array.size/2].toString())
        }
        else
            answer.append(array[array.size/2].toString())
        return answer.toString()
    }
}