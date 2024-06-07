class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val rows = arr1.size
        val cols = arr1[0].size
        val result=Array(rows){IntArray(cols)}
        
        for(i in 0 until rows){
        for(j in 0 until cols){
            result[i][j]=arr1[i][j]+arr2[i][j] //아니 그냥 이러기만 하면 됨?
        }
    }
        return result
    }
}