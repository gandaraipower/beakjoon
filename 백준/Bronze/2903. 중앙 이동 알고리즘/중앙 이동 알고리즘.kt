fun main() {
    val n = readLine()!!.toInt()
    val points = (1 shl n) + 1 //1 sh1 n은 2의 n제곱,변의 개수+1이 공식
    val result = points * points
    println(result)
}
