package step4;

import java.util.Scanner;

public class B5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[31];

        for(int i = 1; i <= 28; i++) {
            int submit = sc.nextInt();
            student[submit] = 1;
        }
        for(int j = 1; j < student.length; j++) {
            if(student[j] != 1) System.out.println(j);
        }
    }
}
