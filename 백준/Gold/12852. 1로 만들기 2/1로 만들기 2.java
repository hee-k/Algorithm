import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        int[] bf = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + 1;
            bf[i] = i - 1;

            if (i % 2 == 0) {
                int count = arr[i / 2] + 1;
                if (count < arr[i]) {
                    arr[i] = count;
                    bf[i] = i / 2;
                }
            }

            if (i % 3 == 0) {
                int count = arr[i / 3] + 1;
                if (count < arr[i]) {
                    arr[i] = count;
                    bf[i] = i / 3;
                }
            }
        }

        System.out.println(arr[n]);

        // 최솟값 만든 경로 역추적
        int current = n;
        while (current != 0) {
            System.out.print(current + " ");
            current = bf[current];
        }
    }
}