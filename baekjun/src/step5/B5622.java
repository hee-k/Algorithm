package step5;

import java.util.Scanner;

public class B5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String arr[] = s.split("");

        int num[] = new int[arr.length];
        int sum = 0;
        for(int i = 0; i < arr.length; sum += num[i], i++) {
            switch(arr[i]) {
                case "A" : case "B" : case "C" :
                    num[i] = 3;
                    break;
                case "D" : case "E" : case "F" :
                    num[i] = 4;
                    break;
                case "G" : case "H" : case "I" :
                    num[i] = 5;
                    break;
                case "J" : case "K" : case "L" :
                    num[i] = 6;
                    break;
                case "M" : case "N" : case "O" :
                    num[i] = 7;
                    break;
                case "P" : case "Q" : case "R" : case "S" :
                    num[i] = 8;
                    break;
                case "T" : case "U" : case "V" :
                    num[i] = 9;
                    break;
                case "W" : case "X" : case "Y" : case "Z" :
                    num[i] = 10;
                    break;
            }
        }
        System.out.println(sum);
    }
}
