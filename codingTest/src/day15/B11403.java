package day15;

import java.io.*;
import java.util.StringTokenizer;
public class B11403 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int distance[][];
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        distance = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int v = Integer.parseInt(st.nextToken());
                distance[i][j] = v;
            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (distance[i][k]==1 && distance[k][j]==1) distance[i][j]=1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(distance[i][j] + " ");
            }
            System.out.println();
        }
    }
}
