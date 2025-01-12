package src;

// 정수 배열을 입력 받아 정렬해서 반환하는 함수 작성

import java.util.Arrays;

public class p01 {

    public static void main(String[] args) {
        int[] arr1 = {1, -5, 2, 4, 3};
        int[] arr2 = {2, 1, 1, 3, 2, 5, 4};
        int[] arr3 = {6, 1, 7};

        int[] result1 = sort(arr1);
        int[] result2 = sort(arr2);
        int[] result3 = sort(arr3);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }

    public static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
