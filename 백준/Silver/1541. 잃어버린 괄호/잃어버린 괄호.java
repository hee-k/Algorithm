import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] s = str.split("-");

        int result = 0;

        for (int i = 0; i < s.length; i++) {
            int sum = 0;
            String[] num = s[i].split("\\+");
            for (String n : num) {
                sum += Integer.parseInt(n);
            }

            if (i == 0) {
                result += sum;
            } else {
                result -= sum;
            }
        }

        System.out.println(result);
    }
}