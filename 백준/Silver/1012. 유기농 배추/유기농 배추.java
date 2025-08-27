import java.io.*;
import java.util.*;

public class Main {
    static int M, N, K;
    static int[][] field;
    static boolean[][] visited;
    static final int[] dx = {1, -1, 0, 0};
    static final int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로
            N = Integer.parseInt(st.nextToken()); // 세로
            K = Integer.parseInt(st.nextToken());

            field = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()); // 0 ~ M-1
                int y = Integer.parseInt(st.nextToken()); // 0 ~ N-1
                field[y][x] = 1; // 주의: y가 행(세로), x가 열(가로)
            }

            int worms = 0;
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (field[y][x] == 1 && !visited[y][x]) {
                        bfs(x, y);
                        worms++;
                    }
                }
            }
            out.append(worms).append('\n');
        }

        System.out.print(out);
    }

    static void bfs(int sx, int sy) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        visited[sy][sx] = true;
        q.offer(new int[]{sx, sy});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if (visited[ny][nx]) continue;
                if (field[ny][nx] == 0) continue;

                visited[ny][nx] = true;
                q.offer(new int[]{nx, ny});
            }
        }
    }
}