class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var count=0
        for(i in 0 until array.size){
            if(array[i]==n){
                count++
            }
        }
        return count
    }
}