fun main() {
    val (n, b) = readLine()!!.split(" ")
    val number = n.toInt()  //입력한 10진수 값
    val base = b.toInt() //진법 전환할 값 2~36진법

    println(convertDecimalToBase(number, base))
}

fun convertDecimalToBase(number: Int, base: Int): String {
    if (number == 0) return "0"

    var n = number
    val result = StringBuilder() //문자열 저장할 StringBuilder 생성

    while (n > 0) {
        val remainder = n % base  //현재 자리의 값
        result.append(
            if (remainder < 10) {
                '0' + remainder
            } else {
                'A' + (remainder - 10)
            }
        )
        n /= base
    }

    return result.reverse().toString()
}

/*
remainder = 60466175 % 36 = 35 -> remainder가 35이므로 'Z'로 변환.

result.append('Z') -> result = "Z"

number = 60466175 / 36 = 1679615

remainder = 1679615 % 36 = 35 -> 'Z'

result.append('Z') -> result = "ZZ"

number = 1679615 / 36 = 46655

remainder = 46655 % 36 = 35 -> 'Z'

result.append('Z') -> result = "ZZZ"

number = 46655 / 36 = 1295

remainder = 1295 % 36 = 35 -> 'Z'

result.append('Z') -> result = "ZZZZ"

number = 1295 / 36 = 36

remainder = 35 % 36 = 35 -> 'Z'

result.append('Z') -> result = "ZZZZZ"

number = 35 / 36 = 0 

0이 되었으므로 종료

결과:

result.reverse() -> result = "ZZZZZ"*/
