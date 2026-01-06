import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            boolean[] check = new boolean[26];
            char prev = word.charAt(0);
            boolean isGroup = true;

            for (int j = 1; j < word.length(); j++) {
                char curr = word.charAt(j);

                if (curr != prev) {
                    check[prev - 'a'] = true;

                    if (check[curr - 'a']) {
                        isGroup = false;
                        break;
                    }

                    prev = curr;
                }
            }

            if (isGroup) count++;
        }

        System.out.println(count);
    }
}