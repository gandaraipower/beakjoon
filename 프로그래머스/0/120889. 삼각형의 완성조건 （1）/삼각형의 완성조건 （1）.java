class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int ab=0; //둘이 합한 값
        int c=0; //제일 큰 값
        int sum=0;
        
        for(int i=0;i<sides.length;i++){
            sum+=sides[i];
        }
        
        for(int i=0;i<sides.length;i++){
            if(c<=sides[i]){
                c=sides[i];
            }
        }
        ab=sum-c;
        if(ab>c){
            answer=1;
        }
        else{
            answer=2;
        }
        
        return answer;
    }
}