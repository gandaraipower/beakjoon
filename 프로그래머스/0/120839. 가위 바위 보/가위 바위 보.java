class Solution {
    public StringBuilder solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0;i<rsp.length();i++){
            char a=rsp.charAt(i);
            switch(a){
                case '0':
                    answer.append('5');
                    break;
                case '2':
                    answer.append('0');
                    break;
                case '5':
                    answer.append('2');
                    break;
            }
        }
        return answer;
    }
}