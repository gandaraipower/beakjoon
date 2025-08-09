import java.util.*;
//i=0   j=1 2 3 4
//i=1   j=2 3 4
//i=2   j=3 4
//i=3   j=4
class Solution {
    //인덱스끼리 다 더하고 겹치는거 제거 
    public List<Integer> solution(int[] numbers) {

        int index1=0;
        int index2=0;
        int count=0;
        int a=0;
        int b=1;
        int sum=0;    

        List<Integer> arr=new ArrayList<>();
        
        for(int i=a;i<numbers.length-1;i++){                       
            for(int j=a+1;j<numbers.length;j++){ 
                            sum=0;

                    index1=numbers[i];
                    index2=numbers[j];
                    sum=index1+index2;
                    if(j==1 && i==0){
                            arr.add(sum);
                    }else{
                                    count=0;
                    for(int k=0;k<arr.size();k++){ //하나씩 보고 넣어버리니까 안되는구나
                            if(sum==arr.get(k)){
                            count++;
                            }  
                        
                    }
                        if(count==0){
                                arr.add(sum);
                        }
                        }
                
                }
            a++;
        }
        Collections.sort(arr);
        return arr;
    }
}