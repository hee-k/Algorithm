package day2;

import java.util.Scanner;

public class B11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String sNum = sc.next();
        // Stirng -> char
        char[] cNum = sNum.toCharArray();

        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            // 문자 -> 숫자 변환(아스키코드)
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
