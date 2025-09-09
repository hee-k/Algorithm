import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        n = n.replace('9', '6');

        int[] cnt = new int[10];
        for (char c : n.toCharArray()) {
            int num = c - '0';
            cnt[num]++;
        }

        cnt[6] = (cnt[6] + 1) / 2;

        int result = 0;
        for (int num : cnt) {
            if (num > result) {
                result = num;
            }
        }
        
        System.out.println(result);
    }
}