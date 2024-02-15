package day12;

import java.util.*;
public class B1016 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();
        boolean[] check = new boolean[(int) (max - min + 1)];
        // 2^2부터 시작
        for (long i = 2; i * i <= max; i++) {
            long pow = i * i;
            long startIndex = min / pow;

            if (min % pow != 0)
                startIndex++;
            for (long j = startIndex; pow * j <= max; j++) {
                check[(int) ((j * pow) - min)] = true;
            }
        }
        int count = 0;
        for (int i = 0; i <= max - min; i++) {
            if (!check[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
