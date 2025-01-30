package src;

// https://school.programmers.co.kr/learn/courses/30/lessons/42889?language=java
// 실패율

import java.util.HashMap;

public class p06 {

    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        p06 p = new p06();
        int[] result = p.solution(N, stages);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        // 도전자 수
        int[] challenger = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            challenger[stages[i]]++;
        }

        // 실패자 수
        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;

        // 실패율
        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) fails.put(i, 0.);
            else {
                fails.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }

        // 내림차순 정렬
        answer = fails.entrySet().stream()
                .sorted((o1, o2) -> {
                    if (o1.getValue() > o2.getValue()) return -1;
                    else if (o1.getValue() < o2.getValue()) return 1;
                    else return o1.getKey() - o2.getKey();
                })
                .mapToInt(o -> o.getKey())
                .toArray();

        return answer;
    }
}
