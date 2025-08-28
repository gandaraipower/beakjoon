import java.util.*;

class Solution {
    public List<String> solution(String[] strings, int n) {
        List<String> list=new ArrayList<>();
        
        for(String s:strings){
            list.add(s);
        }
        
        list.sort((a, b) -> {
    if (a.charAt(n) > b.charAt(n)) {
        return 1; //b를 앞에 둔다 (내림차순)
    } else if (a.charAt(n) < b.charAt(n)) {
        return -1; //a를 앞에 둔다 (오름차순)
    } else {
        return a.compareTo(b); // 문자가 같으면 사전순 비교
    }
});
        return list;
    }
}