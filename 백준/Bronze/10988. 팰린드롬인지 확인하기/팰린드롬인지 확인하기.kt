fun main() {
    val input = readLine() ?: return //문자열 입력
    var inputs=input.reversed() 

    if(inputs==input)
        print("1")
    else
        print("0")
}