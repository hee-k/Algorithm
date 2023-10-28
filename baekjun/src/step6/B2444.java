package step6;

import java.util.Scanner;

public class B2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i,j,k,l;

        for(i=0;i<n;i++) { // 파란색 선 위쪽
            for(j=i+1;j<n;j++) {
                System.out.print(" ");
            }
            for(k=i;k>=0;k--) { // 빨간색 선 왼쪽
                System.out.print("*");
            }
            for(l=i;l>0;l--) { // 빨간색 선 오른쪽
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<n;i++) { // 파란색 선 아래쪽
            for(j=i;j>0;j--) {
                System.out.print(" ");
            }
            for(k=i;k<n;k++) { // 빨간색 선 왼쪽
                System.out.print("*");
            }
            for(l=i+1;l<n;l++) { // 빨간색 선 오른쪽
                System.out.print("*");
            }
            System.out.println();
        }
    }
}