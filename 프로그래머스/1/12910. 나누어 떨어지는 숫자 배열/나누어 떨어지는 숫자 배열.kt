class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        var n=1
        var m=1
        for(i in arr)
        {
            if(i%divisor==0){
                answer+=i
            }
        }
        if(answer.isEmpty()){
            answer+=-1
        }
        while(m<answer.size){ 
            for (j in 0 until answer.size-m){
            if(answer[j]>answer[j+1]){
                var temp=answer[j]
                answer[j]=answer[j+1]
                answer[j+1]=temp
            }
        }
            m++
        }
        return answer
    }
}