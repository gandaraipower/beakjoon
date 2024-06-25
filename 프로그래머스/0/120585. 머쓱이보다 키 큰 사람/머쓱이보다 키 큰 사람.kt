class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var count: Int = 0
        for(i in 0 until array.size){
            if(height<array[i]){
                count++
            }
        }
        return count
    }
}