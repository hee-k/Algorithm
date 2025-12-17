import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int l;
    static boolean[][] visited;
    static int[][] distance;

    static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            l = Integer.parseInt(br.readLine());

            visited = new boolean[l][l];
            distance = new int[l][l];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            sb.append(bfs(startX, startY, endX, endY)).append("\n");
        }

        System.out.println(sb);
    }

    static int bfs(int startX, int startY, int endX, int endY) {
        if (startX == endX && startY == endY) {
            return 0;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;
        distance[startX][startY] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < l && ny >= 0 && ny < l && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    distance[nx][ny] = distance[x][y] + 1;
                    queue.add(new int[]{nx, ny});

                    if (nx == endX && ny == endY) {
                        return distance[nx][ny];
                    }
                }
            }
        }
        
        return -1;
    }
}