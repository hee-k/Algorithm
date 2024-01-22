package day8;

import java.util.Scanner;

public class B2023 {
    static int n;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // 2, 3, 5, 7
        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);
    }

    static void dfs(int num, int digit) {
        if (digit == n) {
            if (isPrime(num)) {
                System.out.println(num);
            }
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (isPrime(num * 10 + i)) {
                dfs(num * 10 + i, digit + 1);
            }
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
