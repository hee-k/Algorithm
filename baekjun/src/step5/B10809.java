package step5;

import java.util.Arrays;
import java.util.Scanner;

public class B10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int arr[] = new int[26];
        Arrays.fill(arr, -1);

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(arr[c - 97] != -1) continue;;
            arr[c - 97] = i;
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
