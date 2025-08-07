class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            char a=my_string.charAt(i);
            if(Character.isUpperCase(a)){
                answer+=Character.toLowerCase(a);
                
            }
            if(Character.isLowerCase(a)){
                                answer+=Character.toUpperCase(a);

            }
        }
        return answer;
    }
}