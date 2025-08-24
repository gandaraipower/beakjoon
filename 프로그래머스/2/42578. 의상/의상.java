import java.util.*;

class Solution {
    
    //계산식 (종류+1)(종류2+1)-1
    public int solution(String[][] clothes) {
        Map<String,Integer> map=new HashMap<>();
       
        for(int i=0;i<clothes.length;i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        
    
        int sum = 1;
        for(String key:map.keySet()){
            sum*=(map.get(key)+1);
        }
        sum--;
        return sum;
    }
}