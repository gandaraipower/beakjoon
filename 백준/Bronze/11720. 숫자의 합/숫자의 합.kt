//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var n = readLine() ?.toInt() ?:return
    var input = readLine() ?:return //만약 null이면 종료
    var chunks = input.chunked(1) //chunked는 문자열을 size만큼 분할하여 리스트에 저장
    val data = chunks.map {it.toInt() } //map함수를 이용해 각 부분을 정수로 변환
    var sum : Int =0
    for(i in 0 until  n){
        sum+=data[i]
    }

    print(sum)
}
