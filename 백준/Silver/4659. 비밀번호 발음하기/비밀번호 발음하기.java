import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String password = br.readLine();
            if (password.equals("end")) break;

            boolean isVowel = false;
            int vowelCount = 0;
            int consonantCount = 0;
            char prev = ' ';

            boolean isAcceptable = true;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                // 2. 모음, 자음 체크
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    isVowel = true;
                    vowelCount++;
                    consonantCount = 0;
                } else {
                    consonantCount++;
                    vowelCount = 0;
                }

                if (vowelCount >= 3 || consonantCount >= 3) {
                    isAcceptable = false;
                    break;
                }

                // 3. 연속 글자 체크
                if (prev == c && c != 'e' && c != 'o') {
                    isAcceptable = false;
                    break;
                }

                prev = c;
            }

            // 1, 모음 포함 체크
            if (!isVowel) {
                isAcceptable = false;
            }

            if (isAcceptable) {
                sb.append("<").append(password).append("> is acceptable.\n");
            } else {
                sb.append("<").append(password).append("> is not acceptable.\n");
            }
        }

        System.out.println(sb);
    }
}