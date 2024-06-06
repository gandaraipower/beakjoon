class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        var array=s.toCharArray()
        var count=0
        for(i in array){
            when(i)
            {
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
                'q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G',
                'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'-> answer=false
            }
            count++
        }
        if ((count == 4 || count == 6) && answer == true) {
                answer=true
            }
            else {
                answer=false
        }
            return answer
    }
}