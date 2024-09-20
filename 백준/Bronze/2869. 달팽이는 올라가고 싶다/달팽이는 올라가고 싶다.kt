fun main() {
    var a=0 //낮에 올라가는 길이
    var b=0 //밤에 미끄러지는 길이
    var v=0 //올라가야 할 높이
    var h=0 //하루동안 올라간 높이
    var t=1

    val input = readLine() ?: return // 문자열 입력
    val parts = input.split(" ") // 공백을 기준으로 입력값을 분리
    a=parts[0].toIntOrNull() ?: return
    b=parts[1].toIntOrNull() ?: return
    v=parts[2].toIntOrNull() ?: return

    h=a-b
//(v-a)/h 는 마지막 날 전까지 필요한 날 수
    val answer = if ((v - a) % h == 0) { //나눠 떨어질 경우 1일 추가
        (v - a) / h + 1
    } else {    //그렇지 않을 경우엔 2일 추가
        (v - a) / h + 2
    }
    //   a b v
    //ex.2 1 5 입력시 h=1 하루에 1씩 올라가고
    //(5-2)/1=3 3일을 올라가고 다음날 낮에 2를 올라가면 끝

    print(answer)
}

