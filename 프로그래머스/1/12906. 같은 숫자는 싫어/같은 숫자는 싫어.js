function solution(arr)
{
    var answer = [];
    let prevValue=arr[0];
    answer.push(prevValue);
    
    for(i=1;i<arr.length ; i++){
           if(prevValue==arr[i]){ 
           } 
        else{
            prevValue=arr[i];
            answer.push(arr[i]);
        }
    }
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log('Hello Javascript')
    
    return answer;
}