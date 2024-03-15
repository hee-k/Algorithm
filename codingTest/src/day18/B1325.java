package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class B1325 {
    static int n, m;
    static boolean[] visited;
    static int[] answer;
    static ArrayList<Integer>[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new ArrayList[n + 1];
        answer = new int[n + 1];

        for (int i = 1; i <= n; i++)
            a[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            a[S].add(E);
        }
        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            bfs(i);
        }

        int maxVal = 0;
        for (int i = 1; i <= n; i++) {
            maxVal = Math.max(maxVal, answer[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (answer[i] == maxVal)
                System.out.print(i + " ");
        }
    }

    public static void bfs(int index) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(index);
        visited[index] = true;
        while (!queue.isEmpty()) {
            int now_node = queue.poll();
            for (int i : a[now_node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    answer[i]++;
                    queue.add(i);
                }
            }
        }
    }
}