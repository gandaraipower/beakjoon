import java.io.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N,K;
    static int[] visited=new int[100001]; //1부터 시작하려고

    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st=new StringTokenizer(br.readLine()," ");

       N=Integer.parseInt(st.nextToken());
       K=Integer.parseInt(st.nextToken());

       if(N==K){
           System.out.println(0);
           return;
       }else{
           dfs();
       }

    }

    static void dfs(){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(N);
        visited[N]=1; // 1초 걸렸다는 거임

        while(!queue.isEmpty()){
            int currentPos=queue.poll();

            for(int i=0;i<3;i++){
                int nextPos;
                if(i==0){
                    nextPos=currentPos+1;
                }else if(i==1){
                    nextPos=currentPos-1;
                }else{
                    nextPos=currentPos*2;
                }

                if(nextPos==K){
                    System.out.println(visited[currentPos]); //현재 위치까지 온 시간 출력
                    return;
                }

                if(nextPos>=0 && nextPos<=100000 && visited[nextPos]==0){
                    queue.add(nextPos);
                    visited[nextPos]=visited[currentPos]+1;
                }
            }
        }
    }
}