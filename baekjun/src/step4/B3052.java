package step4;

import java.util.Scanner;

public class B3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int check = 0;
        int count = 0;
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt() % 42;
        }
        for(int j = 0; j < num.length; j++) {
            check = 0;
            for(int k = (j + 1); k < num.length; k++) {
                if(num[j] == num[k]) check++;
            }
            if(check == 0) count++;
        }
        System.out.println(count);
    }
}
