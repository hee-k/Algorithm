package step4;

import java.util.Scanner;

public class B10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n];
        int[][] exchange = new int[m][2];
        for(int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }
        for(int j = 0; j < m; j++) {
            exchange[j][0] = sc.nextInt();
            exchange[j][1] = sc.nextInt();
        }
        for(int k = 0; k < m; k++) {
            int temp = basket[exchange[k][0] - 1];
            basket[exchange[k][0] - 1] = basket[exchange[k][1] - 1];
            basket[exchange[k][1] - 1] = temp;
        }
        for(int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}


