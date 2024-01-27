package day8;

import java.util.*;
public class B1206 {
    static boolean visited[];
    static ArrayList<Integer>[] a;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 정점
        int m = scan.nextInt(); // 간선
        int start = scan.nextInt();
        a = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int s = scan.nextInt();
            int e = scan.nextInt();
            a[s].add(e);
            a[e].add(s);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(a[i]);
        }
        visited = new boolean[n + 1];
        dfs(start);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(start);
        System.out.println();

    }

    public static void dfs(int node) {
        System.out.print(node + " ");
        visited[node] = true;
        for (int i : a[node]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        visited[node] = true;

        while (!queue.isEmpty()) {
            int now_node = queue.poll();
            System.out.print(now_node + " ");
            for (int i : a[now_node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
