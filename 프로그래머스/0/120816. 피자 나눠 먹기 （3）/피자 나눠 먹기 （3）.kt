class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0
        var pizza=n
        while(pizza>0){
            pizza-=slice
                answer++
        }
        return answer
    }
}