package step5;

import java.util.Scanner;

public class B1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        if(s == "") {
            System.out.print("0");
        } else {
            String[] arr = s.split(" ");
            System.out.print(arr.length);
        }
    }
}
