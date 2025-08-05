import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<my_string.length();i++){
            char a=my_string.charAt(i);
            if(Character.isDigit(a)){
                list.add(Character.getNumericValue(a));
            }
        }
        Collections.sort(list, Comparator.naturalOrder());
        return list;
    }
}