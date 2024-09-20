fun main() {
    val X = readLine()!!.toInt()

    var diagonal = 1 // 대각선 번호
    var count = 0 // 지금까지 지나온 분수의 개수

    // X번째 분수가 속하는 대각선 번호를 찾는다
    while (count + diagonal < X) {
        count += diagonal
        diagonal++
    }

    // 대각선 안에서 X번째 분수의 위치
    val indexInDiagonal = X - count

    val numerator: Int
    val denominator: Int

    // 홀수 대각선 (아래에서 위로 가는 방향)
    if (diagonal % 2 == 1) {
        numerator = diagonal - (indexInDiagonal - 1)
        denominator = indexInDiagonal
    }
    // 짝수 대각선 (위에서 아래로 가는 방향)
    else {
        numerator = indexInDiagonal
        denominator = diagonal - (indexInDiagonal - 1)
    }

    // 결과 출력
    println("$numerator/$denominator")
}