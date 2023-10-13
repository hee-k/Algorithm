package step4;

import java.util.Scanner;

public class B1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m = 0, sum = 0, result = 0;
        double[] score = new double[n];
        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        m = score[0];
        for(int i = 0; i < n; i++) {
            if(m < score[i]) m = score[i];
        }
        for(int i = 0; i < n; i++) {
            score[i] = score[i] / m * 100;
            sum += score[i];
        }
        result = sum / n;
        System.out.println(result);
    }
}
