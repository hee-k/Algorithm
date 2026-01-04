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
        for (int idx = 1; idx <= n; idx++) {
            basket[idx] = idx;
        }

        for (int a = 0; a < m; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int idx = 1; idx <= n; idx++) {
            sb.append(basket[idx]).append(" ");
        }

        System.out.println(sb.toString().trim());

    }
}