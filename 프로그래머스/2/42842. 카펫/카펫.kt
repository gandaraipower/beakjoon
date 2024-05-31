class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
          var answer = intArrayOf(0, 0)
    var total = brown + yellow

    for(h in 1..total){
        if(total % h==0){
            val w=total/h
            if(w>=h && (w-2)*(h-2)==yellow) { //가로에서 테두리 2칸 뺌,세로에서 테두리 2칸 뺌
                answer[0]=w
                answer[1]=h
            }
        }
    }
        return answer
    }
}