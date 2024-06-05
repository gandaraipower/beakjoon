class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var count=0
        var input=0
      
        var array=IntArray(10){0}
        for (i in numbers){
            when(i){
                0->array[0]=1
                1->array[1]=1
                2->array[2]=1
                3->array[3]=1
                4->array[4]=1
                5->array[5]=1
                6->array[6]=1
                7->array[7]=1
                8->array[8]=1
                9->array[9]=1
            }
        }
        
        for(j in 0 until array.size){
            if(array[j]==0){
                answer+=j
            }
        }
        return answer
    }
}