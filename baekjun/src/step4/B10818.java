package step4;

import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int max = num[0];
        for(int i = 0; i < n; i++) {
            if(num[i] > max) max = num[i];
        }
        int min = num[0];
        for(int j = 0; j < n; j++) {
            if(num[j] < min) min = num[j];
        }
        System.out.println(min + " " + max);
    }
}

