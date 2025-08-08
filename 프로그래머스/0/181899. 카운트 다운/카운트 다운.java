import java.util.*;

class Solution {
    public List<Integer> solution(int start_num, int end_num) {
        List<Integer> arr=new ArrayList<>();
        
        for(int i=start_num;i>=end_num;i--){
            arr.add(i);
        }
        //10, 3 10 9 8 7 6 5 4 3
        return arr;
    }
}