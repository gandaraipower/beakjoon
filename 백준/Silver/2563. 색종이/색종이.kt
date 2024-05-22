fun main() {

    val array1 = Array(100) { IntArray(100) { 0 } }
    val input1 = readlnOrNull() ?: return
    val num = input1.toInt()
    var count=0
    for (i in 0 until num) { //입력된 수만큼 입력을 받기 위함
        val input2 = readlnOrNull() ?: return
        val num2 = input2.split(" ").map { it.toInt() }

        for (j in 0 until 10) {
            for (k in 0 until 10) {
                array1[num2[0] + j][num2[1] + k] = 1    //1로 색칠
            }
        }
    }

    for(i in 0 until 100){
        for (j in 0 until 100) {
            if (array1[i][j] == 1)
                count++ //1일때마다 카운트 상승
        }
    }

    print(count)
}
