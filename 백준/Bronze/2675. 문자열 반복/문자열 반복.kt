//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val repeatCount = readLine()?.toIntOrNull() ?: return // 입력값으로 받은 반복 횟수
    val inputs = mutableListOf<String>()
    repeat(repeatCount) {
        val input = readLine() ?: return // 문자열 입력
        val parts = input.split(" ") // 공백을 기준으로 입력값을 분리
        val r = parts[0].toIntOrNull() ?: return // R 값, 정수로 변환하고 입력이 없으면 종료
        val s = parts[1] // 문자열 S

        // 문자열 S의 각 문자를 R번 반복하여 새 문자열 P를 만듦
        val p = StringBuilder()
        for (char in s) {
            repeat(r) {
                p.append(char)
            }
        }
    inputs.add(p.toString())
    }

    println(inputs.joinToString ("\n"))
}