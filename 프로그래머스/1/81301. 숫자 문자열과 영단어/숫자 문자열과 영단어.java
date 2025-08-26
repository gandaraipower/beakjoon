import java.util.*;

class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder(); // 최종 결과
        StringBuilder sb1 = new StringBuilder(); // 영단어 임시 저장

        while(s.length() > 0){
            char ch = s.charAt(0);

            if(Character.isDigit(ch)){ // 숫자라면
                sb.append(ch); // 숫자 바로 추가
            } else {
                sb1.append(ch); // 문자 추가

                // sb1이 완전한 영단어이면 숫자로 변환
                switch(sb1.toString()){
                    case "zero": sb.append(0); sb1.setLength(0); break;
                    case "one": sb.append(1); sb1.setLength(0); break;
                    case "two": sb.append(2); sb1.setLength(0); break;
                    case "three": sb.append(3); sb1.setLength(0); break;
                    case "four": sb.append(4); sb1.setLength(0); break;
                    case "five": sb.append(5); sb1.setLength(0); break;
                    case "six": sb.append(6); sb1.setLength(0); break;
                    case "seven": sb.append(7); sb1.setLength(0); break;
                    case "eight": sb.append(8); sb1.setLength(0); break;
                    case "nine": sb.append(9); sb1.setLength(0); break;
                }
            }

            s = s.substring(1); // 다음 문자로
        }

        return Integer.parseInt(sb.toString());
    }
}