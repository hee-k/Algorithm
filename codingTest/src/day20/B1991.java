package day20;

import java.util.*;
public class B1991 {
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        arr = new int[26][2];
        for (int i = 0; i < n; i++) {
            String[] temp = sc.nextLine().split(" ");
            int node = temp[0].charAt(0) - 65;
            char left = temp[1].charAt(0);
            char right = temp[2].charAt(0);

            if (left == '.') {
                arr[node][0] = -1;
            } else {
                arr[node][0] = left - 65;
            }
            if (right == '.') {
                arr[node][1] = -1;
            } else {
                arr[node][1] = right - 65;
            }
        }
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
        System.out.println();
    }
    public static void preOrder(int now) {
        if (now == -1)
            return;
        System.out.print((char) (now + 65));
        preOrder(arr[now][0]);
        preOrder(arr[now][1]);
    }
    public static void inOrder(int now) {
        if (now == -1)
            return;
        inOrder(arr[now][0]);
        System.out.print((char) (now + 65));
        inOrder(arr[now][1]);
    }
    public static void postOrder(int now) {
        if (now == -1)
            return;
        postOrder(arr[now][0]);
        postOrder(arr[now][1]);
        System.out.print((char) (now + 65));
    }
}
