import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val line = br.readLine()
        val sides = line.split(" ").map { it.toInt() }.sorted() 
        val (a, b, c) = sides 

        if (a == 0 && b == 0 && c == 0) break

        if (a * a + b * b == c * c) {
            println("right")
        } else {
            println("wrong")
        }
    }
}