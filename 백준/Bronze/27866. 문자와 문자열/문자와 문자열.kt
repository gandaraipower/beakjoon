//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var s = readLine() ?: return
    var i = readLine() ?.toIntOrNull() ?: return

    var result = if(i in 1 .. s.length) {
        s[i-1]
    }
    else{}
    print(result)
    


}