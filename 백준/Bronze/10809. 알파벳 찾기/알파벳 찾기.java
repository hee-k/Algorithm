import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (arr[idx] == -1) {
                arr[idx] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]);
            if (i < 25) {
                sb.append(' ');
            }
        }

        System.out.println(sb.toString());
    }
}