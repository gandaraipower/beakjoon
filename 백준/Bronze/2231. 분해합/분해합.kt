fun main() {
    val n = readLine()!!.toInt()
    var result = 0

    for (i in maxOf(1, n - n.toString().length * 9)..n) {
        val sum = i + i.toString().map { it.toString().toInt() }.sum()
        if (sum == n) {
            result = i
            break
        }
    }

    println(result)
}