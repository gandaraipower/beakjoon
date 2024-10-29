function solution(money) {
    var answer = [];
    let coffee=5500;
    var cup=0;
    var don=0;
    while(true){
        money=money-coffee;
        cup++;
        
        if(money==0){
            don=money;
            break;
        }
        else if(money<0){
            cup--;
            don=money+coffee;
            break;
        }
    }
    answer.push(cup);
    answer.push(don);
    return answer;
}