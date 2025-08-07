import java.util.*;

class Solution {
    public List<String> solution(String[] names) {
        
        List<String> array=new ArrayList<>();

        //5명씩 묶어서 가장 앞에 있는 사람 리턴
        //안묶어도 되는듯?
        //0 , 5 ,10 
        for(int i=0;i<names.length;i++){
            if(i%5==0){
                array.add(names[i]);
            }
        }
        return array;
    }
}