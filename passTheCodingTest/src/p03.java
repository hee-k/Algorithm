// https://school.programmers.co.kr/learn/courses/30/lessons/68644?language=java
// 두 개 뽑아서 더하기

package src;

import java.util.HashSet;

public class p03 {

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 4, 1};
        int[] arr2 = {5, 0, 2, 7};

        p03 p = new p03();
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
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer>  hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hashSet.add(numbers[i] + numbers[j]);
            }
        }
        answer = hashSet.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
