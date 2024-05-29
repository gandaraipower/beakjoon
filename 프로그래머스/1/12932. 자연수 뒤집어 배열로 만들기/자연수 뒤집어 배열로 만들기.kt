class Solution {
    fun solution(n: Long): IntArray {
         val x = n.toString()
        // long형을 String형으로 전환
        val input = x.reversed() //string형만 reversed()함수 사용 가능
        val charArray = input.toCharArray() //문자 배열 생성
        val numberArray = charArray.map { it.toString().toInt() }.toIntArray()
       //문자 배열이니까 String형으로 바꾸고 Int형으로 바꿈 
       //Int 배열은 Int형만 들어갈수있기 때문
        return numberArray
    }
}