class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int a=dot[0];
        int b=dot[1];
        
        if(a>0 && b>0){
            answer=1;
        }
        if(a>0 && b<0){
            answer=4;
        }
        if(a<0 && b>0){
            answer=2;
        }
        if(a<0 && b<0){
            answer=3;
        }
        
        return answer;
        
    }
}