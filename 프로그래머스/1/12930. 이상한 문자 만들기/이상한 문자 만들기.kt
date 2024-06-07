class Solution {
    fun solution(s: String): String {
        var answer = ""
        var array=s.toCharArray()
        var count=1
        for(i in array.indices){
            if(array[i]!=' '){
            array[i] = if (count % 2 != 0) {
                    array[i].uppercaseChar()
                } else {
                    array[i].lowercaseChar()
                }
            count++
            }
            else
                count=1
        }
            
        return array.joinToString("")
    }
}