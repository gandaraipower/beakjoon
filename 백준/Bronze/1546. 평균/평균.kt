//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var n: Int = 0 //과목 개수
    var m: Int = 0 //그중 가장 작은 값
    var sum: Double = 0.0 //합
    var average: Double = 0.0
    n = readLine()!!.toInt()
    var input = readLine() ?: return //만약 null이면 종료
    var data = input.split(" ").map { it.toInt() }.toTypedArray(); //성적 넣을 곳

    if(data.size != n) {
        println("올바른 개수의 숫자를 입력하세요.")
        return
    }
    m=data[0]
    for(i in 1..n-1){
        if(m<data[i]) m=data[i]  //최고값 구하기
    }

    for(i in 0..n-1){
      var a = data[i]/m.toDouble()*100 //점수/m*100으로 수정
        // 코틀린에선 정수형과 실수형 간의 연산이 발생하면 실수형으로 자동 형변환됨
        sum += a //값 넣기
    }
    average=sum/n
    print(average)
    


}

