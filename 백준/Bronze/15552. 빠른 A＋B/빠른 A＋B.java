import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 입력값으로 총 입력받을 쌍의 개수를 결정
        int totalPairs = Integer.parseInt(reader.readLine());

        // 쌍의 개수만큼 루프를 돌며 숫자 쌍을 입력받아 합을 계산하고 출력
        for (int i = 0; i < totalPairs; i++) {
            String[] inputPair = reader.readLine().split(" ");
            int num1 = Integer.parseInt(inputPair[0]);
            int num2 = Integer.parseInt(inputPair[1]);
            int sum = num1 + num2;

            // 결과 출력
            writer.write(String.valueOf(sum));
            writer.newLine();
        }

        writer.flush();

        // 리소스 정리
        reader.close();
        writer.close();
    }
}