import java.util.*;

class Solution {
    public List<Integer> solution(int n, int k) {
        
        //n=9 k=3 3,6,9
        List<Integer> answer=new ArrayList<>();
        for(int i=k;i<=n;i++){
            if(i%k==0){
                answer.add(i);
            }
        }
        return answer;
    }
}