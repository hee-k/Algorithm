package src;

import java.util.ArrayList;
import java.util.Arrays;

public class p04 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 2};

        p04 p = new p04();
        int[] result1 = p.solution(arr1);
        int[] result2 = p.solution(arr2);

        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : result2) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int[] answers) {
        int[] answer = {};

        // 정답 패턴
        int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 점수
        int[] scores = new int[3];

        // 채점
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                if (answers[i] == patterns[j][i % patterns[j].length]) {
                    scores[j]++;
                }
            }
        }

        // 최대 점수
        int max = Arrays.stream(scores).max().getAsInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max) {
                arrayList.add(i + 1);
            }
        }

        answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
