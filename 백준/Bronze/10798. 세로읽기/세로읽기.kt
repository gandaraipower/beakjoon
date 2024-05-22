fun main(){
    val array2=Array(15){Array<Any?>(5){null}}
    for(i in 0 until 5){
        val input= readlnOrNull() ?:return
        val inputs=input.toCharArray() //붙어잇는 문자열을 한문자씩 나눌려면 toCharArray() 써야함
        for(j in 0 until inputs.size){
            array2[j][i]=inputs[j]    //00,10,20,30...
        }
    }

    val result=array2.flatMap{it.filterNotNull()} //flatMap으로 2차원 배열을 1차원 리스트로 전환
    //filterNotNull() null값을 제거
  println(result.joinToString("")) //joinToString(구분문자) 리스트를 문자열로 전환하여 출력
}