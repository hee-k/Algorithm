package day10;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class B1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 양수 : 내림차순
        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();
        int one = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            if (data > 1) {
                plusPq.add(data);
            } else if (data == 1) {
                one++;
            } else if (data == 0) {
                zero++;
            } else {
                minusPq.add(data);
            }
        }
        int sum = 0;
        // 양수
        while (plusPq.size() > 1) {
            int first = plusPq.remove();
            int second = plusPq.remove();
            sum = sum + first * second;
        }
        if (!plusPq.isEmpty()) {
            sum = sum + plusPq.remove();
        }

        // 음수
        while (minusPq.size() > 1) {
            int first = minusPq.remove();
            int second = minusPq.remove();
            sum = sum + first * second;
        }
        if (!minusPq.isEmpty()) {
            if (zero == 0) {
                sum = sum + minusPq.remove();
            }
        }
        // 1
        sum = sum + one;
        System.out.println(sum);
    }
}