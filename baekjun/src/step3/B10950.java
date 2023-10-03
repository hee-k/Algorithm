package step3;

import java.util.Scanner;

public class B10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[][] num = new int[2][test];
        for (int i=0; i<test; i++) {
            num[0][i] = sc.nextInt();
            num[1][i] = sc.nextInt();
        }
        for (int j=0; j<test; j++) {
            System.out.println(num[0][j] + num[1][j]);
        }
    }
}
