package day11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class B1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] S, int[] E) {
                if (S[1] == E[1]) {
                    return S[0] - E[0];
                }
                return S[1] - E[1];
            }
        });
        int count = 0;
        int end = -1;
        for (int i = 0; i < n; i++) {
            if (a[i][0] >= end) {
                end = a[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
