package step4;

import java.util.Scanner;

public class B10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][3];
        int[] basket = new int[n];
        for(int i = 0; i < m; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        for(int j = 0; j < m; j++) {
            for(int k = arr[j][0]; k <= arr[j][1]; k++) {
                basket[k - 1] = arr[j][2];
            }
        }
        for(int k = 0; k < basket.length; k++) {
            System.out.print(basket[k] + " ");
        }
    }
}
