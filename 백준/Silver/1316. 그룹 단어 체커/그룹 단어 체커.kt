fun main() {
    val input = readLine() ?: return // 문자열 입력
    val inputs=input.toInt() //Int형으로 전환
    var list= mutableListOf<String>()

    for(i in 0 until inputs) {
        val word= readLine()?:return
        list.add(word)
/*        list[i] = readLine() ?: return //일단 리스트에 입력받은값 넣음 */
    }

    var count=0

    for(word in list) {
        if(isGroupWord(word)) {
            count++
        }
    }

    println(count)
}

fun isGroupWord(word: String): Boolean {
    val seen = mutableSetOf<Char>()  // 이미 등장한 문자를 추적하는 집합
    var prevChar: Char? = null       // 이전 문자를 추적하는 변수

    for (char in word) {             // 단어의 각 문자를 순차적으로 검사
        if (char != prevChar) {      // 현재 문자가 이전 문자와 다른 경우
            if (char in seen) {      // 현재 문자가 이미 등장한 문자라면
                return false         // 그룹 단어가 아니므로 false를 반환
            }
            seen.add(char)           // 현재 문자를 seen 집합에 추가
        }
        prevChar = char              // 이전 문자를 현재 문자로 업데이트
    }

    return true                      // 모든 문자를 검사한 후 그룹 단어이면 true를 반환
}


