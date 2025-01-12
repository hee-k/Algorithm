package src;

import java.util.Arrays;
import java.util.Collections;

public class p02 {

    public static void main(String[] args) {
        int[] arr1 = {4, 2, 2, 1, 3, 4};
        int[] arr2 = {2, 1, 1, 3, 2, 5, 4};

        int[] result1 = solution(arr1);
        int[] result2 = solution(arr2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    private static int[] solution(int[] arr) {
        // 증복 제거
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);

        // 내림차순 정렬
        Arrays.sort(result, Collections.reverseOrder());

        // int[]로 변환
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}
