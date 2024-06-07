class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf(0,0)
        var count=0
        var max=0
        var min=0
            for(i in 1 .. n){ //최대공약수
                if(n%i==0 && m%i==0){ //둘다 나눴을때 0이라면
                    max=i   
                }
            }
                min=n*m/max
            answer[0]=max
            answer[1]=min
        return answer
    }
}