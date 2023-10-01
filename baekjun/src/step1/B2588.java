package step1;

import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result1, result2, result3 = 0;
        int num1, num2, num3 = 0;

        num1 = b / 100;
        result3 = a * (num1);

        num2 = (b - (num1 * 100)) / 10;
        result2 = a * num2;

        num3 = b - (num1 * 100) - (num2 * 10);
        result1 = a * num3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(a*b);
    }
}
