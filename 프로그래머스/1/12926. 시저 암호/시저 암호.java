class Solution {
    public StringBuilder solution(String s, int n) {

        StringBuilder sb=new StringBuilder();     
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a==' '){
                sb.append(" ");
            }else if(Character.isLowerCase(a)){
            a=(char)('a'+(a-'a'+n)%26);
            sb.append(Character.toString(a));
            }else{
                a=(char)('A'+(a-'A'+n)%26);
                sb.append(Character.toString(a));
            }
        }
        return sb;
    }
}