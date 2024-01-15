package day6;

import java.util.Scanner;

public class B11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int insertPoint = i;
            int insertValue = a[i];
            for (int j = i-1; j >= 0; j--) {
                if (a[j] < a[i]) {
                    insertPoint = j + 1;
                    break;
                }
                if (j == 0) {
                    insertPoint = 0;
                }
            }
            for (int j = i; j > insertPoint; j--) {
                a[j] = a[j - 1];
            }
            a[insertPoint] = insertValue;
        }
        // 합배열
        s[0] = a[0];
        for (int i = 1; i < n; i++) {
            s[i] = s[i - 1] + a[i];
        }
        // 합배열 총합
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += s[i];
        }
        System.out.println(sum);
    }
}
