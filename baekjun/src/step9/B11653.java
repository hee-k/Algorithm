package step9;

import java.util.Scanner;

public class B11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 2;

        while(n != 1) {
            if(n % num == 0) {
                n /= num;
                System.out.println(num);
            } else num++;
        }
    }
}
