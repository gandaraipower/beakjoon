class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //n=20이면 , 1,20  2,10 4,5 5,4 10,2 20,1   return 6;
        for(int i=1;i<=n;i++){ //1*20-1+1
            if(n%i==0){
                answer++;
            }
        }
        return answer;
    }
}