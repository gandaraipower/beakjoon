import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n=br.readLine().toInt()

      if(n>100){
        println("N은 100이하입니다")
        return
    }

    val number= br.readLine().split(" ").map { it.toInt() }.sorted() 
    var count=0
    //소수가 몇 개인지 찾아서 출력 1과 자신으로만 나눠지는 것


    for(i in number){
        if(i>1000){
            println("1000이하의 자연수를 입력하세요")
            return
        }
    }
    
    for(i in number){
        var sosuCounter=0
        if(i>1){                      //7 3  2  3
            for(j in 2 .. i-1){
                if(i%j==0) sosuCounter++  
            }

        if(sosuCounter==0){
            count++
        }

    }
}

println(count)
}