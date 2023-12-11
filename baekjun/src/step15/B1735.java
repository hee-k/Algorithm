package step15;

import java.util.Scanner;

public class B1735 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int c1, c2, p1, p2;

        //c1/p1, c2/p2
        c1= scan.nextInt();
        p1= scan.nextInt();
        c2= scan.nextInt();
        p2= scan.nextInt();

        //더해주고
        c1=c1*p2+c2*p1;
        p1=p1*p2;
        int gcd= getGcd(c1, p1); //최대공약수를 구해준다.

        System.out.println(c1/gcd+" "+p1/gcd); //기약분수 출력
    }//main

    public static int getGcd(int a, int b) {
        if(a%b==0) {
            return b;
        }
        return getGcd(b, a%b);
    }
}
