package step2;

import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m >= 45) {
            m -= 45;
        }
        else {
            if (h == 0)  {
                h = 23;
            } else {
                h--;
            }
            m = 60-45+m;
        }
        System.out.println(h + " " + m);
    }
}
