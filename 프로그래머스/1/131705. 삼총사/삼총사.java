class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int first=0;
        int second=0;
        int third=0;
        int target=0;
//0 1 third : 2 3 4
//0 2 third : 2 3 4
//0 3 third : 2 3 4
//1 1 third : 2 3 4        
//1 2 third : 2 3 4
//1 3 third : 2 3 4
//1 4 third : 2 3 4
//2 1 third : 2 3 4
//2 2 third : 2 3 4
//2 3 third : 2 3 4
//3 4 third : 2 3 4
//중복을 어케 없애노        
        
        for(int i=0;i<number.length;i++){
           
                first=number[i];
            for(int j=i+1;j<number.length;j++){
                second=number[j];
                
                for(int k=j+1;k<number.length;k++){
                    
                    third=number[k];
                
                if(first+second+third==0){
                
                        answer++;
                
                }
                
        
            }

        }
        }

                
        
        return answer;
    }
}