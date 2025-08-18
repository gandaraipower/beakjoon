import java.util.*;

class Solution {
    public StringBuilder solution(int[] food) {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<food.length;i++){
                int a=food[i]/2;
            
                for(int j=0;j<a;j++){
                    sb.append(i);
                }
}
                        StringBuilder sb1=new StringBuilder(sb);
        sb1.reverse();
        sb.append(0);
        sb.append(sb1);
    
        return sb;
    }
}