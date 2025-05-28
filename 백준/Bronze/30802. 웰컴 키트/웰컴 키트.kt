import java.io.*
import java.util.*
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n= br.readLine().toInt()
    
    val sizes = br.readLine().split(" ").map { it.toInt() } .toMutableList() //이렇게 불변 리스트를 가변 리스트로 복사하거나


    if (sizes.size != 6) {
    println("오류: 정확히 6개의 값을 입력해야 합니다.")
    return
}

    if(n>sizes.sum()){ //sum함수로 간소화 가능
        println("오류: 티셔츠는 남아도 되지만 부족해서는 안 됩니다 ")
        return
    }

    val (min,max)=br.readLine().split(" ").map{it.toInt()}

    val total=sizes.sum()
    var dass=0


for (i in 0 until 6) {
    if (sizes[i] > 0) {
        dass += (sizes[i] + min - 1) / min  // 올림 나눗셈 (x + y - 1) / y  →  x개를 y개씩 묶으면 몇 묶음 필요한가? (올림 나눗셈)
    }
}
        var p=total/max
        var P=total%max

        println(dass)
        println("$p $P")

}