class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=1;i<=cipher.length();i++){
            char a=cipher.charAt(i-1);
            if(i%code==0){
                answer+=a;
            }
        }
        return answer;
    }
}