package day17;

import java.util.Scanner;
public class B11726 {
    static long mod = 10007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] d = new long[1001];
        d[1] = 1;  // 2*1일 때
        d[2] = 2;  // 2*2일 때
        for(int i=3; i<=n; i++){
            d[i] = (d[i-1] + d[i-2]) % mod;
        }
        System.out.println(d[n]);
    }
}
