class Solution {
    fun solution(phone_number: String): String {
        var array=phone_number.toCharArray()
        var answer = StringBuilder()
        for(i in 0 until phone_number.length-4){
            array[i]='*'
        }
        for(j in array)
        {
            answer.append(j.toString())
        }
        
        return answer.toString()
    }
}