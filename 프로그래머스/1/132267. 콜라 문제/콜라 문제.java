class Solution {
    //a: 콜라를 받기 위해 마트에 주어야 하는 병 수
    //b: 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수
    //n: 상빈이가 가지고 있는 빈 병의 개수
    //
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n>=a){
        int get=n/a*b;
        answer+=get;
        n=n-n/a*a +get;
        }
       
        
        return answer;
    }
}