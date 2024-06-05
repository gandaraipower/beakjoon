class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var sum=0
        for(i in 0 until a.size){
            sum+=(a[i]*b[i])
        }
        return sum
    }
}