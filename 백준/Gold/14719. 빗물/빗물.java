import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[] block = new int[w];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < w; i++) {
            block[i] = Integer.parseInt(st.nextToken());
        }

        int[] left = new int[w];
        left[0] = block[0];
        for (int i = 1; i < w; i++) {
            left[i] = Math.max(left[i - 1], block[i]);
        }

        int[] right = new int[w];
        right[w - 1] = block[w - 1];
        for (int i = w-2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], block[i]);
        }

        int result = 0;
        for (int i = 0; i < w; i++) {
            result += Math.min(left[i], right[i]) - block[i];
        }

        System.out.println(result);
    }
}