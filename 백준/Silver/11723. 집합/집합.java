import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        boolean[] set = new boolean[21];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();

            if (word.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = true;

            } else if (word.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = false;

            } else if (word.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                sb.append(set[x] ? 1 : 0).append('\n');

            } else if (word.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = !set[x];

            } else if (word.equals("all")) {
                for (int j = 1; j <= 20; j++) {
                    set[j] = true;
                }

            } else if (word.equals("empty")) {
                for (int j = 1; j <= 20; j++) {
                    set[j] = false;
                }
            }
        }

        System.out.print(sb);
    }
}