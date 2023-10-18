package step5;

import java.util.Scanner;

public class B11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += str.charAt(i)-'0'; // charAt()의 반환값은 아스키 값이므로 -'0' or -48
        }
        System.out.println(sum);
    }
}
