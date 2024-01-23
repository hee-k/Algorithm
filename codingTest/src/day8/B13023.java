package day8;

import java.util.*;
public class B13023 {
    static boolean visited[];
    static ArrayList<Integer>[] a;
    static boolean arrive;
    public static void main(String[] args) {
        int n; // 정점 갯수
        int m; // 간선 갯수
        arrive = false;

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        a = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            a[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int s = scan.nextInt();
            int e = scan.nextInt();
            a[s].add(e);
            a[e].add(s);
        }
        for (int i = 0; i < n; i++) {
            dfs(i, 1);
            if (arrive)
                break;
        }
        if (arrive)
            System.out.println("1");
        else
            System.out.println("0");
    }
    public static void dfs(int now, int depth) {
        // depth == 5 => 종료
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }
        visited[now] = true;
        for (int i : a[now]) {
            if (!visited[i]) {
                dfs(i, depth + 1);
            }
        }
        visited[now] = false;
    }
}
