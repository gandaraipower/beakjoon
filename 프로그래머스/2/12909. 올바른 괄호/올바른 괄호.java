import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('){
            stack.push(a);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()=='(' && !stack.isEmpty()){
                    stack.pop();
                }
            }
                
        }
        
       if(!stack.isEmpty()){
           return false;
       }
      

        return true;
    }
}