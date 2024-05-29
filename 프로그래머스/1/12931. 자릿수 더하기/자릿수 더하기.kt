class Solution {
    fun solution(n: Int): Int {
        var sum=0 //더할꺼
        val str=n.toString()
        for(char in str) {
            sum+=char.digitToInt() //digitToint() 문자를 숫자로 변환
        }
        return sum
    }
}

