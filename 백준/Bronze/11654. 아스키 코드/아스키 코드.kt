//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var input = readLine() ?: return
    var char = input.toCharArray()  //문자열은 toInt()가 불가능하므로 charArray로 전환
    for (char in char) {
        val ascii = char.toInt()
        print(ascii)
    }
}
