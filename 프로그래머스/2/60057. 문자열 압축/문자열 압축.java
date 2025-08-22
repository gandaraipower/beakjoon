import java.util.*;

class Solution {
    public int solution(String s) {
        // 초기 최솟값은 압축이 안된 문자열의 길이
        int minLength = s.length();

        // 1. 자르기 단위를 1부터 문자열 길이의 절반까지 반복 (1개씩, 2개씩, ...)
        for (int unit = 1; unit <= s.length() / 2; unit++) {
            StringBuilder compressed = new StringBuilder();
            
            // 첫 번째 묶음 (비교 대상)
            String prev = s.substring(0, unit);
            int count = 1;

            // 2. 단위만큼 이동하며 반복
            for (int i = unit; i <= s.length(); i += unit) {
                String current;
                
                // 남은 문자열의 길이가 단위보다 짧을 경우, 끝까지 잘라냄
                if (i + unit <= s.length()) {
                    current = s.substring(i, i + unit);
                } else {
                    current = s.substring(i);
                }

                // 3. 이전 묶음과 현재 묶음이 같은지 비교
                if (prev.equals(current)) {
                    count++;
                } else {
                    // 4. 반복 그룹이 끝나면 압축 결과를 추가
                    if (count > 1) {
                        compressed.append(count);
                    }
                    compressed.append(prev);

                    // 다음 비교를 위해 prev와 count 초기화
                    prev = current;
                    count = 1;
                }
            }

            // 5. 마지막 남은 그룹 처리
            // 이 로직이 for문이 끝난 후에 실행되어야 합니다.
            if (count > 1) {
                compressed.append(count);
            }
            compressed.append(prev);

            // 6. 현재 압축된 문자열의 길이와 최솟값을 비교하여 업데이트
            minLength = Math.min(minLength, compressed.length());
        }
        
        // s의 길이가 1일 경우 for 루프가 실행되지 않으므로, 원래 길이 1이 반환
        // 그 외에는 minLength가 반환됨
        return minLength;
    }
}