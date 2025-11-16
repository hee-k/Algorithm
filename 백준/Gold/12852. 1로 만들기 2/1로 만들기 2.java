import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + 1;

            if (i % 2 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            }

            if (i % 3 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 3] + 1);
            }
        }

        System.out.println(arr[n]);

        printPath(n, arr);
    }

    static void printPath(int n, int[] arr) {
        System.out.print(n + " ");

        if (n == 1) return;

        if (n % 3 == 0 && arr[n] == arr[n / 3] + 1) {
            printPath(n / 3, arr);
        } else if (n % 2 == 0 && arr[n] == arr[n / 2] + 1) {
            printPath(n / 2, arr);
        } else {
            printPath(n - 1, arr);
        }
    }
}