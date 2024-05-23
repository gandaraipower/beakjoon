fun main() {
    val test= readLine()?:return
    val t = test.toInt()  //테스트 케이스의 개수 t
    val q=25 //쿼터 $0.25
    val d=10 //다임 $0.10
    val n=5 //니켈 $0.05
    val p=1 //페니 $0.01
    var remainder=0
    val result=Array(t){IntArray(4){0} }

    for(t in 0 until t) {
        val cent = readLine() ?: return
        val c = cent.toInt() //거스름돈 c,c의 단위 센트,1달러=100센트 50이면 0.5달러

        val qcount = c / q  //쿼터 개수 구하기
        if (qcount == 0) { //만약 쿼터의 개수가 0이라면
            remainder = c //나머지값을 그대로 둠
        } else
            remainder = c % q //0이 아니라면 나머지값을 구함

        val dcount = remainder / d //다임 개수 구하기,남은 값을 나눠서 개수 구하기
        if (dcount == 0)
        else
            remainder = remainder % d //0이 아니라면 나머지값을 구함

        val ncount = remainder / n //니켈 개수 구하기,남은 값을 나눠서 개수 구하기
        if (ncount == 0)
        else
            remainder = remainder % n //0이 아니라면 나머지값을 구함

        val pcount = remainder / p //페니 개수 구하기,남은 값을 나눠서 개수 구하기
        result[t][0]=qcount
        result[t][1]=dcount
        result[t][2]=ncount
        result[t][3]=pcount
    }

    for(i in 0 until t)
    println("${result[i][0]} ${result[i][1]} ${result[i][2]} ${result[i][3]}")
}