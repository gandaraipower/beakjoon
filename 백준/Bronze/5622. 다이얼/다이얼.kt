fun main() {
    val input = readLine() ?: return // 문자열 입력
    var array = mutableListOf<Int>() //mutableListOf는 가변배열 배열에 요소 추가하기 위함
    var sum = 0 //더할꺼

    for(i in 0 until input.length){
        if(input[i] == 'A' || input[i] =='B' || input[i] =='C') //||는 하나라도 맞으면 참
            array.add(3)
        if(input[i] == 'D' || input[i] =='E' || input[i] =='F')
            array.add(4)
        if(input[i] == 'G' || input[i] =='H' || input[i] =='I')
            array.add(5)
        if(input[i] == 'J' || input[i] =='K' || input[i] =='L')
            array.add(6)
        if(input[i] == 'M' || input[i] =='N' || input[i] =='O')
            array.add(7)
        if(input[i] == 'P' || input[i] =='Q' || input[i] =='R' || input[i] =='S')
            array.add(8)
        if(input[i] == 'T' || input[i] =='U' || input[i] =='V')
            array.add(9)
        if(input[i] == 'W' || input[i] =='X' || input[i] =='Y' || input[i] =='Z')
            array.add(10)
    }

/*    for(i in 0 until input.length){
        when(input[i]){
            'A', 'B', 'C' -> array.add(3)
            'D', 'E', 'F' -> array.add(4)
            'G', 'H', 'I' -> array.add(5)
            'J', 'K', 'L' -> array.add(6)
            'M', 'N', 'O' -> array.add(7)
            'P', 'Q', 'R', 'S' -> array.add(8)
            'T', 'U', 'V' -> array.add(9)
            'W', 'X', 'Y', 'Z' -> array.add(10)
        }
    }*/
    
    for(i in array) //여기서 i는 array[i]임
        sum+=i

    print(sum)


}