package day8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class B10989 {
    public static int[] a;
    public static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        sort(a, 5);
        for (int i = 0; i < n; i++) {
            bw.write(a[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void sort(int[] a, int maxSize) {
        int[] output = new int[a.length];
        int digit = 1;
        int count = 0;
        while (count != maxSize)
        {
            int[] arr = new int[10];
            for (int i = 0; i < a.length; i++) {
                arr[(a[i] / digit) % 10]++;
            }
            // index 계산
            for (int i = 1; i < 10; i++) {
                arr[i] += arr[i - 1];
            }
            for (int i = a.length - 1; i >= 0; i--) {
                output[arr[(a[i] / digit % 10)] - 1] = a[i];
                arr[(a[i] / digit) % 10]--;
            }
            for (int i = 0; i < a.length; i++) {
                a[i] = output[i];
            }
            digit *= 10;
            count++;
        }
    };
}