import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final long INF = Long.MAX_VALUE;
    static int n, m;
    static int[][] edges;
    static long[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        edges = new int[m][3];
        dist = new long[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            edges[i][0] = Integer.parseInt(st.nextToken());
            edges[i][1] = Integer.parseInt(st.nextToken());
            edges[i][2] = Integer.parseInt(st.nextToken());
        }

        if (bellmanFord(1)) {
            System.out.println(-1);
        } else {
            for (int i = 2; i <= n; i++) {
                if (dist[i] == INF) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dist[i]).append("\n");
                }
            }
            System.out.print(sb);
        }
    }

    static boolean bellmanFord(int start) {
        Arrays.fill(dist, INF);
        dist[start] = 0;

        // 조기종료 추가
        for (int i = 1; i <= n - 1; i++) {
            boolean changed = false;
            for (int[] edge : edges) {
                int from = edge[0];
                int to = edge[1];
                int weight = edge[2];

                if (dist[from] != INF && dist[from] + weight < dist[to]) {
                    dist[to] = dist[from] + weight;
                    changed = true;
                }
            }
            if (!changed) break;
        }

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];

            if (dist[from] != INF && dist[from] + weight < dist[to]) {
                return true;
            }
        }

        return false;
    }
}