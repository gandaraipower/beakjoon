function solution(s){
    var answer = true;
    var p=0;
    var y=0;
    for(i=0;i<s.length;i++){
           if(s[i]=="p" || s[i]=="P"){
                p++;
           }
        if(s[i]=="y" || s[i]=="Y"){
            y++;
        }
        
    }
    if(p==0 && y==0){
      answer=true;
    }
    else{
            if(p==y){
        answer=true;
    }
    else
        answer=false; 
        }
    

    return answer;
}