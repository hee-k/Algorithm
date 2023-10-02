package step2;

import java.util.Scanner;

public class B2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int min = sc.nextInt();

        m += min;

        if (m >= 60) {
            h += m / 60;
            m %= 60;
            if (h >= 24) {
                h -= 24;
            }
        }
        System.out.println(h + " " + m);
    }
}
