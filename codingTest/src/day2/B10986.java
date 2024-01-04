package day2;

import java.io.IOException;
import java.util.Scanner;

public class B10986 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] s = new long[n];
        long[] c = new long[m];

        long answer = 0;
        s[0] = sc.nextInt();
        // 합 배열
        for (int i = 1; i < n; i++) {
            s[i] = s[i - 1] + sc.nextInt();
        }
        // s의 모듈러 연산
        for (int i = 0; i < n; i++) {
            int remainder = (int) (s[i] % m);
            if (remainder == 0) answer++;
            c[remainder]++;
        }

        for (int i = 0; i < m; i++) {
            if (c[i] > 1) {
                answer = answer + (c[i] * (c[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}
