import java.util.*;

class Solution {
    public List<Integer> solution(int[] array) {
        
        List<Integer> arr=new ArrayList();
        int max=0;
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>=max){
                max=array[i];
                index=i;
            }
        }
        arr.add(max);
        arr.add(index);
        return arr;
    }
}