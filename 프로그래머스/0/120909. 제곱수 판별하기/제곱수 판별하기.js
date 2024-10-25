function solution(n) {
    var answer = 0;
    
    for(a=1;a<=1000;a++){
        if(a*a==n){
            answer=1;
            break;
        }
        else
            answer=2;
    }
    return answer;
}