class Solution { //overflow 문제
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var sub: String
        for (i in 0 until t.length - p.length + 1) {
            sub = t.substring(i, i + p.length) //(0,2)이면 0,1 인덱스 추출
            if (sub.isNotEmpty() && sub.toLong() <= p.toLong())
                answer++
        }
        return answer
    }
}
