import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        int[] answer = {};
        List<Integer> arr=new ArrayList<>();
        //n의 약수 , 오름차순 배열 리턴
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        arr.add(n);
        return arr;
    }
}