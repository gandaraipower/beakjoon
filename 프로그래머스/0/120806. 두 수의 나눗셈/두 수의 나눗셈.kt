class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        var number:Double=0.0
        number=num1.toDouble()/num2.toDouble()*1000
        answer=number.toInt()
        return answer
    }
}