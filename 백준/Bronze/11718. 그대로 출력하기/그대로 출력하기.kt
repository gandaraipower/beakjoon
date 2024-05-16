fun main() {
    val lines = mutableListOf<String>()

    // 입력 받기
    var line: String?
    while (true) {
        line = readLine() ?: break // 입력이 없으면 종료
        if (line.isBlank()) break // 빈 줄이 입력되면 종료 //isBlank()함수 비어있다면
        lines.add(line)
    }

    // 입력 받은 대로 출력하기
    for (line in lines) {
        println(line)
    }
}
