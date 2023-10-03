package step3;

import java.util.Scanner;

public class B25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();
        int sum = 0;
        int[][] product = new int[2][num];
        for (int i=0; i<num; i++) {
            product[0][i] = sc.nextInt();
            product[1][i] = sc.nextInt();
            sum += product[0][i] * product[1][i];
        }
        String result = (total == sum) ? "Yes": "No";
        System.out.println(result);
    }
}
