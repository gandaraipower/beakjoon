fun main() {
    // 입력을 읽어온다.
    val (n, b) = readLine()!!.split(" ")
    val base = b.toInt()

    // 10진법으로 변환한다.
    val decimalValue = convertBaseToDecimal(n, base)

    // 결과를 출력한다.
    println(decimalValue)
}

fun convertBaseToDecimal(n: String, base: Int): Long {
    var decimalValue: Long = 0
    var power: Long = 1

    // 문자열을 역순으로 순회하면서 각 자리수를 처리한다.
    for (char in n.reversed()) {
        val digitValue = if (char in '0'..'9') {
            char - '0' //문자 7이 들어오면 '7'-'0' = 7
        } else {
            char - 'A' + 10 //문자 C가 들어오면 'C'-'A'+10=2+10=12
        }
        decimalValue += digitValue * power //10진법 값 누적
        power *= base //현재 자리수의 가중치를 다름 자리수의 가중치로 업데이트
    }

    return decimalValue
}
