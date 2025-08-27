import java.io.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        Queue<Integer> queue=new PriorityQueue<>();

        for(int i=0;i<N;i++){
            int x=Integer.parseInt(br.readLine());
            if(x!=0) {
                queue.offer(x);
            }else{
                if(queue.isEmpty()){
                    sb.append(0);
                }else {
                    sb.append(queue.poll());
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}