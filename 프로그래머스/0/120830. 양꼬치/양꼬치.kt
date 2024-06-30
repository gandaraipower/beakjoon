class Solution {
    fun solution(n: Int, k: Int): Int {
        var sumN=n
        var sumK=k
        var result=0
        while(sumN>=10){
                sumK--
                sumN-=10
        }
        result=n*12000+sumK*2000
        return result
    }
}