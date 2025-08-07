import java.util.*;

class Solution {
    public StringBuilder solution(String my_string) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<my_string.length();i++){
            char a=my_string.charAt(i);
                if(Character.isUpperCase(a)){
                    a=Character.toLowerCase(a);
                }
                sb.append(a);
        }
        char[] arr=sb.toString().toCharArray();
        Arrays.sort(arr);
        
        StringBuilder s=new StringBuilder(new String(arr));
        return s;
    }
}