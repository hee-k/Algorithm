import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] time;
    static int n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        time = new int[100001];

        System.out.println(bfs(n, k));
    }

    static int bfs(int start, int end) {
        if (start == end) {
            return 0;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        time[start] = 0;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            int[] next = {x - 1, x + 1, x * 2};

            for (int i = 0; i < 3; i++) {
                int nx = next[i];

                if (nx >= 0 && nx <= 100000 && time[nx] == 0 && nx != start) {
                    time[nx] = time[x] + 1;
                    queue.add(nx);

                    if (nx == end) {
                        return time[nx];
                    }
                }
            }
        }

        return -1;
    }
}