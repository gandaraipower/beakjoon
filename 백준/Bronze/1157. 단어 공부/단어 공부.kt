fun main() {
    val input = readLine() ?: return //문자열 입력
    val list = MutableList<Int>(26) { 0 }   //mutableListOf 함수는 초기화 블록을 안받음,개수셀거
    val list2 = mutableListOf<String>()  //mutableListOf 함수는 초기화 블록을 안받음,출력용

    for (i in 0 until input.length) { 
        when (input[i]) {
            'A', 'a' -> list[0] = list[0] + 1
            'B', 'b' -> list[1] = list[1] + 1
            'C', 'c' -> list[2] = list[2] + 1
            'D', 'd' -> list[3] = list[3] + 1
            'E', 'e' -> list[4] = list[4] + 1
            'F', 'f' -> list[5] = list[5] + 1
            'G', 'g' -> list[6] = list[6] + 1
            'H', 'h' -> list[7] = list[7] + 1
            'I', 'i' -> list[8] = list[8] + 1
            'J', 'j' -> list[9] = list[9] + 1
            'K', 'k' -> list[10] = list[10] + 1
            'L', 'l' -> list[11] = list[11] + 1
            'M', 'm' -> list[12] = list[12] + 1
            'N', 'n' -> list[13] = list[13] + 1
            'O', 'o' -> list[14] = list[14] + 1
            'P', 'p' -> list[15] = list[15] + 1
            'Q', 'q' -> list[16] = list[16] + 1
            'R', 'r' -> list[17] = list[17] + 1
            'S', 's' -> list[18] = list[18] + 1
            'T', 't' -> list[19] = list[19] + 1
            'U', 'u' -> list[20] = list[20] + 1
            'V', 'v' -> list[21] = list[21] + 1
            'W', 'w' -> list[22] = list[22] + 1
            'X', 'x' -> list[23] = list[23] + 1
            'Y', 'y' -> list[24] = list[24] + 1
            'Z', 'z' -> list[25] = list[25] + 1
        }
    }

    for (i in 'A'..'Z')
        list2.add("$i") //출력용으로 A부터 Z까지 list2에 넣음

    var max = 0 //제일 많이 쓰인 알파벳 구하기
    var index = 0 //그 알파벳의 인덱스 저장용
    list.forEachIndexed { i, value ->   //forEachIndexed는 각 요소와 해당 인덱스를 함께 반복
        if (value > max) {   //i=해당 인덱스 value=그 인덱스의 값
            max = value //여기서 미리 max값을 구해놓음
            index = i
        }
    }

    var count = 0 //제일 많이 쓰인 알파벳이 여러개인경우 대비
    for (i in list)   //한번더 돌려서 max값이 같은 만큼 count++
        if (i == max)
            count++

    if (count >= 2) //2개 이상 같다면
        print("?")
    else
        print(list2[index])
}
