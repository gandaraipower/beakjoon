//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var s = readLine() ?: return//만약 null이면 종료
    var IntArr = IntArray(26) { -1 } //size26 전부 -1로 초기화
    var count: Int = 0
    for (i in s.indices) {
        val c = s[i] //현재 문자
        val index = c - 'a' //현재 문자의 알파벳 인덱스
        if(IntArr[index] == -1){
            IntArr[index] = i //첫 번째로 등장하는 문자의 인덱스 저장
        }
    }

    for(j in IntArr)
    print("$j ")
}
