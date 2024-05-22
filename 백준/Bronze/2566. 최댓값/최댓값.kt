fun main() {
    val array1 = Array(9) { IntArray(9) { 0 } } //2차원 배열 선언 방법
    val array2=IntArray(2)
    for(i in 0 until 9){
        val input= readLine()?:return
        val inputs=input.split(" ").map { it.toInt() }
        for(j in 0 until 9) {
            array1[i][j]=inputs[j]       //2차원 배열에 입력받은 값 넣기
        }
    }

    var max=0
    for(i in 0 until 9){
        for(j in 0 until 9) {
            if(array1[i][j]>=max){ //모두 0인 경우도 생각해야하므로 =을 붙임
                max=array1[i][j]
                array2[0]=i+1
                array2[1]=j+1
            }
        }
    }
    println(max)
    print("${array2[0]} ${array2[1]}")
    }


