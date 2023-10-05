package step4;

import java.util.Scanner;

public class B10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int result = 0;
        int[] num = new int[count];
        for(int i=0; i<count; i++) {
            num[i] = sc.nextInt();
        }
        int findNum = sc.nextInt();
        for(int j=0; j<count; j++) {
            if(num[j] == findNum) {
                result++;
            }
        }
        System.out.println(result);
    }
}
