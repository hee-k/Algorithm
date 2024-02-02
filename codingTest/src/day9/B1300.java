package day9;

import java.util.Scanner;
public class B1300 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long start = 1, end = k;
        long ans = 0;

        while (start <= end) {
            long middle = (start + end) / 2;
            long count = 0;

            for (int i = 1; i <= n; i++) {
                count += Math.min(middle / i, n);
            }
            if (count < k) {
                start = middle + 1;
            } else {
                ans = middle;
                end = middle - 1;
            }
        }
        System.out.println(ans);
    }
}
