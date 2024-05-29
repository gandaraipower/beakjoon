class Solution {
    fun solution(n: Long): Long {
        // 1. 정수 n을 문자열로 변환
        val x = n.toString()
        
        // 2. 각 문자를 숫자로 변환하여 리스트에 저장
        val numberList = x.map { it.toString().toInt() }
        
        // 3. 리스트를 내림차순으로 정렬
        val sortedList = numberList.sortedDescending()
        
        // 4. 정렬된 숫자 리스트를 다시 문자열로 변환한 후, 이를 정수로 변환
        val sortedString = sortedList.joinToString("")
        val answer = sortedString.toLong()
        
        return answer
    }
}