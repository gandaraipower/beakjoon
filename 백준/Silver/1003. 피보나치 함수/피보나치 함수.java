import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] zeroCount = new int[41];
    static int[] oneCount = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // DP 배열 초기값 설정
        zeroCount[0] = 1;
        oneCount[0] = 0;
        zeroCount[1] = 0;
        oneCount[1] = 1;

        // DP로 미리 계산
        for (int i = 2; i <= 40; i++) {
            zeroCount[i] = zeroCount[i - 1] + zeroCount[i - 2];
            oneCount[i] = oneCount[i - 1] + oneCount[i - 2];
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(zeroCount[N]).append(" ").append(oneCount[N]).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}