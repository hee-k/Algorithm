import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        int[] money = {25, 10, 5, 1};

        for (int i = 0; i < t; i++) {
            int c =  Integer.parseInt(br.readLine());

            for (int j = 0; j < 4; j++) {
                int change = c / money[j];
                sb.append(change);
                if (j < 3) sb.append(" ");
                c %= money[j];
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}