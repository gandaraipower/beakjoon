class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var denom = denom1 * denom2
        var numer1 = numer1
        var numer2 = numer2

        if (denom2 % denom1 == 0) {
            denom = denom2
            numer1 *= (denom2 / denom1)
        } else if (denom1 % denom2 == 0) {
            denom = denom1
            numer2 *= (denom1 / denom2)
        } else {
            numer1 *= denom2
            numer2 *= denom1
        }

        val numer = numer1 + numer2

        // 최대공약수를 구해 분자와 분모를 약분
        val gcdValue = gcd(numer, denom)
        return intArrayOf(numer / gcdValue, denom / gcdValue)
    }

    // 최대공약수를 구하는 함수
    private fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcd(b, a % b)
    }
}
