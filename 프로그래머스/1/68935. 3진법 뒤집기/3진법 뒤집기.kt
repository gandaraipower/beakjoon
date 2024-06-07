class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var x=n.toString(3).reversed() //toString(n)은 10진수를 n진수로 전환,String형임
        var y=x.toInt(3) //toInt(n)는 n진수를 10진수 정수형으로 전환
        answer=y
        return answer
    }
}