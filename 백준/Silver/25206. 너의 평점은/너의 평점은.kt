fun main() {

    val list= mutableListOf<String>() //mutablelist는 add 메서드를 사용해야함
    var sum:Double=0.0
    var sum2:Double=0.0
    var count=0
    for(i in 0 until 20) {
        val input = readLine() ?: return // 문자열 입력
        list.add(input) //add메서드로 추가
        var a=list[i].split(" ")
        var gapyung=a[2]
        var hakjum=a[1].toDouble()
        var pyungjum=0.0
        when(gapyung){
            "A+" -> pyungjum=4.5
            "A0" -> pyungjum=4.0
            "B+" -> pyungjum=3.5
            "B0" -> pyungjum=3.0
            "C+" -> pyungjum=2.5
            "C0" -> pyungjum=2.0
            "D+" -> pyungjum=1.5
            "D0" -> pyungjum=1.0
            "F"  -> pyungjum=0.0
            "P"  -> {hakjum=0.0
                    pyungjum=0.0}
        }
        sum=sum+(pyungjum*hakjum)
        sum2=sum2+hakjum
    }

    print(sum/sum2)
}


