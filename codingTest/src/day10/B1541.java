package day10;

import java.util.Scanner;
public class B1541 {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split("-");
        for (int i = 0; i < str.length; i++) {
            int temp = sumFunc(str[i]);
            if (i == 0)
                answer += temp;
            else
                answer -= temp;
        }
        System.out.println(answer);
    }
    static int sumFunc(String a) {
        int sum = 0;
        String temp[] = a.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
