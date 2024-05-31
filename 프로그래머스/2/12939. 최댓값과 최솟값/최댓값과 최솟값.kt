class Solution {
    fun solution(s: String): String {
        val x=s.split(" ").map{it.toInt()}
        var max=x[0]
        var min=x[0]
        var answer = ""
        for(i in x)
        {
            if(i>max)
                max=i
            if(i<min)
                min=i
        }
        answer="${min} ${max}"
        return answer
    }
}