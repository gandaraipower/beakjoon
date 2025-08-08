class Solution {
    public int solution(int[][] sizes) {

//가로 세로 지갑을 가장 작게 만든다 공식
//가로*세로 너비 이걸 가장 작게 만들어야함
//조합을 통해 전체 가로*전체 세로가 제일 작게 만들어야한다...
//큰쪽을 한쪽으로 몬다? 어차피 큰건 큰거니까
        int maxGaro=0;
        int maxSero=0;
        int garo=0;
        int sero=0;
        
        for(int i=0;i<sizes.length;i++){    
                garo=sizes[i][0];
                sero=sizes[i][1];
            
            if(sero>garo){
                int tmp=garo;
                garo=sero;
                sero=tmp;
            }
            
            if(maxGaro<garo){
                maxGaro=garo;
            }
            if(maxSero<sero){
                maxSero=sero;
            }
        
        
        }
        
        int answer = maxGaro*maxSero;
        return answer;
    }
}