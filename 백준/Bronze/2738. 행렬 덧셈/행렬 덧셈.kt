fun main() {
    val input= readLine()?:return
    val inputs=input.split(" ").map { it.toInt() } //행렬의 크기 n과 m 3 3
    val array1 = Array(inputs[0]){IntArray(inputs[1]){0}} //2차원 배열 선언 방법
    val array2 = Array(inputs[0]){IntArray(inputs[1]){0}}

    for(i in 0 until inputs[0]) {
        val input2 = readLine() ?: return
        val inputs2 = input2.split(" ").map { it.toInt() }
        for (j in 0 until inputs[1]) {
            array1[i][j] = inputs2[j]
        }
    }
    for(i in 0 until inputs[0]) {
        val input2 = readLine() ?: return
        val inputs2 = input2.split(" ").map { it.toInt() }
        for (j in 0 until inputs[1]) {
            array2[i][j] = inputs2[j]
        }
    }
    for(i in 0 until inputs[0]) {
        for (j in 0 until inputs[1]) {
            array2[i][j] = array2[i][j]+array1[i][j]
        }
    }

    for(i in 0 until inputs[0]) {
        for (j in 0 until inputs[1]) {
            print("${array2[i][j]}")
            if(j!=inputs[1]-1)
                print(" ")
        }
        println()
    }
    }


