class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) { // 연속된 수열의 시작점
            int sum = 0;
            for (int j = i; j <= n; j++) { // i부터 시작하여 합계를 계산
                sum += j;
                
                if (sum == n) { // 합이 n과 같으면
                    answer++;
                    break;
                } else if (sum > n) { // 합이 n을 초과하면 더 이상 볼 필요 없음
                    break;
                }
            }
        }
        
        return answer;
    }
}