fun main() {
    val yook = readLine()!!.toInt() //13
    var guri=1
    var rangeEnd=1 //마지막 육각형의 번호

    while(yook>rangeEnd){ //마지막 육각형보다 큰값이면 반복 13>1 13>7 13>13 반복 종료
        rangeEnd+=6*guri // 7 7+6=13
        guri++ //2 3
    }

    print(guri)
    
}
