import java.util.*;

class Solution {
    public List<Integer> solution(String s) {
        int[] answer = {};
        //첫번째는 무조건 자신의 앞에 같은글자 없으므로 -1
        //두번째부터는 자신의 n번재 앞에 같은 글자가 잇으면 n
        //없으면 똑같이 -1
        //배열로 반환한다
        List<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            arr.add(a);
        }
        List<Integer> arr1=new ArrayList<>();
        arr1.add(-1);
        for(int j=1;j<s.length();j++){ //1 0 2 0 1 
                int a=0;
                int count=0; 
                int closed=0;
//j=0 
//j=1 a=0       
//j=2 a=0,1
//j=3 a=0,1,2
//j=4 a=0,1,2,3
//j=5 a=0,1,2,3,4
            while(a<j){ //j-a값을 저장해서 가장 가까운 걸 add
            if(arr.get(j).equals(arr.get(a))){ //j=1 a=0 
                count++;
                closed=j-a;
            }
                
                a++;
            }
            if(count==0){
                arr1.add(-1);
            }else{
                arr1.add(closed);
            }
            
        
        }
        
        return arr1;
    }
}