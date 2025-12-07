import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][][] box;
    static int m, n, h;

    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());   // 가로
        n = Integer.parseInt(st.nextToken());   // 세로
        h = Integer.parseInt(st.nextToken());   // 높이

        box = new int[h][n][m];

        Queue<int[]> queue = new LinkedList<>();

        for (int z = 0; z < h; z++) {
            for (int x = 0; x < n; x++) {
                st = new StringTokenizer(br.readLine());
                for (int y = 0; y < m; y++) {
                    box[z][x][y] = Integer.parseInt(st.nextToken());

                    // 익토
                    if (box[z][x][y] == 1) {
                        queue.add(new int[]{z, x, y});
                    }
                }
            }
        }

        bfs(queue);

        int answer = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (box[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    answer = Math.max(answer, box[i][j][k]);
                }
            }
        }

        System.out.println(answer - 1);
    }

    static void bfs(Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int z = current[0];
            int x = current[1];
            int y = current[2];

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nz >= 0 && nz < h && nx >= 0 && nx < n && ny >= 0 && ny < m
                        && box[nz][nx][ny] == 0) {
                    box[nz][nx][ny] = box[z][x][y] + 1;
                    queue.add(new int[]{nz, nx, ny});
                }
            }
        }
    }
}