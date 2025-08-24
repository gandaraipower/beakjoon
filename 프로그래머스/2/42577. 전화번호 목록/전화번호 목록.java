import java.util.*;
//뭘해야하지...
//아까꺼는 런타임 에러가 나는데 반복문을 2회이상 하면 안됨.
class Solution {
    public boolean solution(String[] phone_book) {

       Arrays.sort(phone_book);
        
        for(int i=0;i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        
        return true;
    }
}