import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = -1;

        for (int i = m; i <= n; i++) {
            boolean check = true;

            if (i < 2) {
                check = false;
            } else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
            }

            if (check) {
                sum += i;
                if (min == -1) min = i;
            }
        }

        if (min == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}