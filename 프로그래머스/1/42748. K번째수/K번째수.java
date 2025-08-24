import java.util.*;

class Solution {
//i번째부터 j번째 까지 자르고 정렬하고 ,k번째에 있는수
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> list2=new ArrayList<>();
        for(int a=0;a<commands.length;a++){
            List<Integer> list=new ArrayList<>();
            int i=commands[a][0]-1;
            int j=commands[a][1]-1;
            int k=commands[a][2]-1;
            
            for(int b=i;b<=j;b++){
                list.add(array[b]);
                }
                  list.sort((c,d)->c-d);
            list2.add(list.get(k));
            
        }
        
        return list2;
    }
}