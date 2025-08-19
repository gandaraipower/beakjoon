import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int comNum = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int pairNum = Integer.parseInt(br.readLine()); // 연결된 쌍 수

        // 인접 리스트 생성
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= comNum; i++) {
            graph.add(new ArrayList<>());
        }

        // 연결 정보 입력 (무방향 그래프)
        for (int i = 0; i < pairNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // BFS 실행
        boolean[] visited = new boolean[comNum + 1];
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;

        queue.add(1);         // 시작은 1번 컴퓨터
        visited[1] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int next : graph.get(cur)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    count++;  // 감염된 컴퓨터 카운트
                }
            }
        }

        System.out.println(count); // 자기 자신 제외
    }
}