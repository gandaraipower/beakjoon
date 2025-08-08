import java.util.*;
class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        int[] answer = {};
        //1,2,3,4,5,6  n=2  3 4 5 6 1 2 이런식?
        List<Integer> arr=new ArrayList<>();
        for(int i=n;i<num_list.length;i++){
            arr.add(num_list[i]);
        }
        for(int j=0;j<n;j++){
            arr.add(num_list[j]);
        }
        return arr;
    }
}