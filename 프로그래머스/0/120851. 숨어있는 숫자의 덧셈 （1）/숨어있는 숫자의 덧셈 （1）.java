import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if (Character.isDigit(a)) {
                answer += Character.getNumericValue(a);
            }
        }
        
        return answer;
    }
}