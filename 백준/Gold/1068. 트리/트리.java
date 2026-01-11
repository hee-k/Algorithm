import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> list;
    static int delete;
    static int leaf = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        int root = -1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int parent = Integer.parseInt(st.nextToken());
            if (parent == -1) {
                root = i;
            } else {
                list.get(parent).add(i);
            }
        }

        delete = Integer.parseInt(br.readLine());

        if (delete == root) {
            System.out.println(0);
        } else {
            dfs(root);
            System.out.println(leaf);
        }
    }

    static void dfs(int node) {
        if (node == delete) return;

        int childCount = 0;
        for (int child : list.get(node)) {
            if (child != delete) {
                childCount++;
                dfs(child);
            }
        }

        if (childCount == 0) {
            leaf++;
        }
    }
}