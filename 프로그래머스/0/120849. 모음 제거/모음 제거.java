class Solution {
    public StringBuilder solution(String my_string) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<my_string.length();i++){
            char a=my_string.charAt(i);
            switch(a){
                case 'a','e','i','o','u':
                break;
                default:
                    sb.append(a);
            }
        }
        
        return sb;
    }
}