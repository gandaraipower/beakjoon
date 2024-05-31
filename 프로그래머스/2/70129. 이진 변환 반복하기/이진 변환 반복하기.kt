class Solution {
    fun solution(s: String): IntArray {
    var answer= intArrayOf(0,0) //요소가 2개인 배열
    val list = mutableListOf<Int>() //가변리스트
    var count0 = 0 //제거한 0의 개수
    var length1 = 0 //남은 1의 길이
    var binarayCount=0 //변환 횟수
    for (char in s) {
        var value = char.toString().toInt()
        list.add(value)   //리스트에 값 추가
    }
    while(list.size>=1){
    for (char in list) {
        when (char) {
            0 -> {
                count0++ //제거된 0의 개수
            }

            1 -> {
                length1++ //1의 길이
            }
        }
    }
    list.clear() //리스트 초기화
    var binaryString = length1.toString(2) //2진수로 전환
    length1 = 0 //0으로 초기화
    for (char in binaryString) {
        var value = char.toString().toInt()
        list.add(value) //리스트에 다시 추가
    }
        binarayCount++ //변환횟수 추가
        if(list.size==1 && list[0]==1) //사이즈가 1이고 첫번째 요소의 값이 1이면
            break
}
    answer[0]=binarayCount
    answer[1]=count0
        return answer
    }
}