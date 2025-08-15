import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // dp[i] = i를 1로 만드는 최소 연산 횟수
        int[] dp = new int[N + 1];

        // 2부터 N까지 bottom-up 방식으로 연산 횟수 계산
        for (int i = 2; i <= N; i++) {
            // 1. 1을 빼는 연산
            dp[i] = dp[i - 1] + 1;

            // 2. 2로 나누어 떨어지면
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3. 3으로 나누어 떨어지면
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[N]);
    }
}