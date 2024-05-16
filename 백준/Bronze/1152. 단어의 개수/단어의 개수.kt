fun main() {
    val input = readLine() ?: return // 문자열 입력
    var count = 0
    var isWord = false

    for (char in input) {
        if (char != ' ' && !isWord) { // 새로운 단어의 시작인 경우
            count++
            isWord = true // 단어를 발견했음을 표시
        } else if (char == ' ') {
            isWord = false // 공백을 만나면 단어가 끝남
        }
    }
    println(count)
}