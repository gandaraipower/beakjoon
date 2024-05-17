fun main() {
    val input = readLine() ?: return // 문자열 입력
    var count = 0
    var i = 0

    while (i < input.length) {
        if (i < input.length - 2) {
            val threeChar = "${input[i]}${input[i+1]}${input[i+2]}"
            if (threeChar == "dz=") {
                count++
                i += 3 //인덱스를 3만큼 증가시켜 제외
                continue
            }
        }

        if (i < input.length - 1) {
            val twoChar = "${input[i]}${input[i+1]}"
            when (twoChar) {
                "c=", "c-", "d-", "lj", "nj", "s=", "z=" -> {
                    count++
                    i += 2 //인덱스를 2만큼 증가시켜 제외
                    continue
                }
            }
        }

        // 일반 알파벳
        count++
        i++
    }

    println(count)
}

//(0,1,2) (0,1) 검사
//(0,1) 이 맞다면 i2증가  둘다 없으면 (맨아래 i++(일반 알파벳)로 인해 (1,2,3) (1,2) 검사
//(2,3,4) (2,3) 검사 이런식으로
