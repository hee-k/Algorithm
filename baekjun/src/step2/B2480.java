package step2;

import java.util.Scanner;

public class B2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int prize = 0;

        if ((a == b) && (a == c)) {
            prize = 10000 + (a * 1000);
        } else if (a==b || a==c || b==c) {
            if (b==c) {
                prize = 1000 + (b * 100);
            } else {
                prize = 1000 + (a * 100);
            }
        } else {
            int max = 0;
            max = ((a>b) && (a>c)) ? a : ((b>a) && (b>c)) ? b : c;
            prize = max * 100;
        }
        System.out.println(prize);
    }
}
