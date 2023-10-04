package step3;

import java.util.Scanner;

public class B11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] num = new int[count][2];
        for(int i=0; i<count; i++) {
            num[i][0] = sc.nextInt();
            num[i][1] = sc.nextInt();
        }
        for(int j=0; j<count; j++) {
            System.out.println("Case #" + (j+1) + ": " + num[j][0] + " + " + num[j][1] + " = " + (num[j][0] + num[j][1]));
        }
    }
}
