package step13;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class B18870 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] origin = new int[N];	// 원본 배열
        int[] sorted = new int[N];	// 정렬 할 배열
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// rank를 매길 HashMap


        for(int i = 0; i < N; i++) {
            sorted[i] = origin[i] = in.nextInt();
        }

        Arrays.sort(sorted);

        int rank = 0;
        for(int v : sorted) {

            if(!rankingMap.containsKey(v)) {
                rankingMap.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin) {
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);



    }
}