import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정점의 개수
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수

        // 그래프와 방문 배열 초기화
        // 1번부터 n번까지 사용하기 위해 n+1 크기로 생성
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력받아 그래프 구성 (양방향)
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            // 방향 없는 그래프이므로 양쪽 모두에 추가
            graph[u].add(v);
            graph[v].add(u);
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            // 아직 방문하지 않은 정점이라면
            if (!visited[i]) {
                dfs(i); // 해당 정점과 연결된 모든 정점을 방문 처리
                count++; 
            }
        }

        System.out.println(count);
    }

    // DFS 함수 정의
    public static void dfs(int node) {
        // 현재 노드를 방문 처리
        visited[node] = true;


        for (int neighbor : graph[node]) {
            // 아직 방문하지 않은 이웃이라면
            if (!visited[neighbor]) {
                dfs(neighbor); // 재귀적으로 방문
            }
        }
    }
}