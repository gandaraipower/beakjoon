function solution(n) {
    var answer = 0;
    var pizza=7;
    if(n<=pizza){
            answer=1;
        }
    else{
    while(true){
        answer++;
        n=n-pizza; 
        if(n<=0)break;
    }
    }
    return answer;
}