import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n + 1];

        for (int a = 0; a < m; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int idx = i; idx <= j; idx++) {
                basket[idx] = k;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int idx = 1; idx <= n; idx++) {
            sb.append(basket[idx]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}