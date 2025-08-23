import java.io.*;
import java.util.*;

//n을 1,2,3의 합으로 나타내는 방법의 수
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t = Integer.parseInt(br.readLine());


        for(int i=0;i<t;i++){
            int[] dp=new int[11];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            int n=Integer.parseInt(br.readLine());

            if(n==1){
                sb.append(1);
                sb.append("\n");
            }
            if(n==2){
                sb.append(2);
                sb.append("\n");
            }
            if(n==3){
                sb.append(4);
                sb.append("\n");
            }

            if(n>=4) {
                for (int j = 4; j <= n; j++) {
                    dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
                }
                sb.append(dp[n]);
                sb.append("\n");
            }
        }

        System.out.println(sb);

    }


}