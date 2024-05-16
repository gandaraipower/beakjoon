fun main() {

    val input = readLine() ?: return
    val inputs = input.toInt()


    for (i in 0 until inputs) {

        for (j in 0 until inputs - i - 1) {
            print(" ")   //i가 0일때 j는 4번반복되므로 빈칸 4번 출력
        }

    for (j in 0 until 2 * i + 1){
        print("*")  //0번째 줄은 1번 별 출력
        }

    println()
}

for(i in inputs-2 downTo 0){

    for(j in 0 until inputs - i -1) {
        print(" ")  //i가 3일때 j는 1번반복되므로 빈칸 1번 출력
    }

    for(j in 0 until 2*i+1){
        print("*") //i가 3일때 j는 7번 반복되므로 * 7번 출력
    }

    println()
    }
}
