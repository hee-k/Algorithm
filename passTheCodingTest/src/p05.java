// https://school.programmers.co.kr/learn/courses/30/lessons/12949?language=java
// 행렬의 곱셈

package src;

public class p05 {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        p05 p = new p05();
        int[][] result = p.solution(arr1, arr2);

        for (int[] i : result) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        int row1 = arr1.length;
        int col1 = arr1[0].length;
        int row2 = arr2.length;
        int col2 = arr2[0].length;

        // 곱셀 결과
        int[][] answerArr = new int[row1][col2];

        // 계산
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    answerArr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answerArr;
    }
}
