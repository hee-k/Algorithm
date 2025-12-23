import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.equals("ENTER")) set.clear();
            else {
                if (!set.contains(input)) {
                    count++;
                    set.add(input);
                }
            }
        }

        System.out.println(count);
    }
}