fun main() {
    val king=1
    val queen=1
    val look=2
    val bishop=2
    val khight = 2
    val phon=8

    val input= readLine()?:return
    var inputs=input.split(" ").map{it.toInt()} //map{it.toInt()}로 Int로 형변환
    var array= mutableListOf<Int>()
    array.add(king-inputs[0])
    array.add(queen-inputs[1])
    array.add(look-inputs[2])
    array.add(bishop-inputs[3])
    array.add(khight-inputs[4])
    array.add(phon-inputs[5])

    for (i in array)
        print("$i ")

}