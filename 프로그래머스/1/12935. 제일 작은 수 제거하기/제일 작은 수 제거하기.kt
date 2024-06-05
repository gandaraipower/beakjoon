class Solution {
    fun solution(arr: IntArray): IntArray {
        if(arr.size<=1)
            return intArrayOf(-1)
            
        val min=arr.minOrNull()?:return intArrayOf(-1) //minOrNull() 최소값 찾기
        val answer=arr.filter{it!=min}  //filter 함수로 최소값 제외하고 새로운 배열 만들기
        
        if(answer.isEmpty())
            return intArrayOf(-1)
            
        return answer.toIntArray()
    }
}
//IntArray(size){초기값}
//intArrayOf() 빈 배열
//intArrayOf(1) 길이 1 [1]
//intArrayOf(1,2,3) 길이 3 [1,2,3]
/*
class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer=arrayListOf<Int>()
        var min=arr[0]
        if(arr.size>1){
            for(i in 1 until arr.size)
            {
                if(arr[i]<min){
                    min=arr[i]
                }
            }
            for(j in 0 until arr.size-1)
            {
                if(arr[j]!=min)
                    answer.add(arr[j])
            }
        }
        else
        {
            answer.add(-1)
        }
        return answer.toIntArray()
    }
}*/
