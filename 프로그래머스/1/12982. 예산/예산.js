function solution(d, budget) {
    var answer = 0;
    var array=d.sort((a,b)=>a-b);
    var sum=0;
    for(i=0;i<array.length;i++){
        sum+=array[i];
        if(budget>=sum){
        answer++;
        }
        else{
            break;
        }
    }
    return answer;
}