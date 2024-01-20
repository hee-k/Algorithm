package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class B1517 {
    public static int[] a, tmp;
    public static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        a = new int[n + 1];
        tmp = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        result = 0;
        mergetSort(1, n);
        System.out.println(result);
    }

    private static void mergetSort(int s, int e) {
        if (e - s < 1)
            return;
        int m = s + (e - s) / 2;
        mergetSort(s, m);
        mergetSort(m + 1, e);
        for (int i = s; i <= e; i++) {
            tmp[i] = a[i];
        }
        int k = s;
        int index1 = s;
        int index2 = m + 1;
        while (index1 <= m && index2 <= e) {
            if (tmp[index1] > tmp[index2]) {
                a[k] = tmp[index2];
                result = result + index2 - k;
                k++;
                index2++;
            } else {
                a[k] = tmp[index1];
                k++;
                index1++;
            }
        }
        while (index1 <= m) {
            a[k] = tmp[index1];
            k++;
            index1++;
        }
        while (index2 <= e) {
            a[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}
