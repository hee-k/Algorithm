package step4;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0, index = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.print(max + "\n" + index);
    }
}
