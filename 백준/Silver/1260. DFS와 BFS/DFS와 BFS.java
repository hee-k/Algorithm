import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int n, m, v;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        graph = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(v);
        sb.append("\n");
        visited = new boolean[n + 1];

        bfs(v);

        System.out.println(sb);
    }

    static void dfs(int idx) {
        visited[idx] = true;
        sb.append(idx).append(" ");

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[idx][i]) dfs(i);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int idx = queue.poll();
            sb.append(idx).append(" ");

            for (int i = 1; i <= n; i++) {
                if (!visited[i] && graph[idx][i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}