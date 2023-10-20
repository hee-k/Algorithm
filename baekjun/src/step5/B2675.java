package step5;

import java.util.Scanner;

public class B2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();

            for(int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                for(int k = 0; k < r; k++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
