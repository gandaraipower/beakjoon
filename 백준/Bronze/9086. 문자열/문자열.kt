//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var t = readLine() ?.toIntOrNull() ?:return
    val strings = mutableListOf<String>()
    for(i in 1 .. t) {
        var s = readLine() ?: return
        strings.add(s)
    }
    for(i in 0 until t) {
        if (strings[i].length < 2)
            println("${strings[i][0]}${strings[i][0]}")
        else
            println("${strings[i][0]}${strings[i][strings[i].length - 1]}")
    }

}

