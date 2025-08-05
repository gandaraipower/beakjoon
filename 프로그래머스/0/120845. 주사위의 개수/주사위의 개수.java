class Solution {
    public int solution(int[] box, int n) {
        //10 8 6일 경우
        //10*8*6=480 box길이 3*2*2=12
        int a=box[0]/n;
        int b=box[1]/n;
        int c=box[2]/n;
        
        System.out.println(a);
                System.out.println(b);

                System.out.println(c);

        int answer=0;
        answer=a*b*c;
        if(a==b&&a==c){
            answer=a^3;
        }
        if(a==b){
            answer=a*a*c;
        }
        if(a==c){
            answer=a*a*b;
        }
        if(b==c){
            answer=b*b*a;
        }
        return answer;
    }
}