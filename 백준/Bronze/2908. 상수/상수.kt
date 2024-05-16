fun main() {
    val input = readLine() ?: return // 문자열 입력
    var inputs= input.split(" ") //분리
    var input1 = inputs[0]
    var input2 = inputs[1]

        var reversed1 = input1.reversed() //reversed() 문자열 뒤집기
        var reversed2 = input2.reversed()

    if(reversed1>reversed2)
        print(reversed1)
    else
        print(reversed2)
}