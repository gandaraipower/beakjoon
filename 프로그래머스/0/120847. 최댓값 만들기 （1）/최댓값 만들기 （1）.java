class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max=1;
        int max2=0;
        for(int i=0;i<numbers.length;i++){
            if(max<numbers[i]){
                max2=max;
                max=numbers[i];
            }else{
                if(max2<numbers[i]){
                    max2=numbers[i];
                }
            }

        }
        
        answer=max*max2;
        return answer;
    }
}