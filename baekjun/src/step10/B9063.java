package step10;

import java.io.*;
import java.util.StringTokenizer;

public class B9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer token;

        int[][] axis = new int[n][2]; //x좌표 y좌표 넣는 배열

        for(int i = 0; i < n; i++){
            token = new StringTokenizer(br.readLine());
            for(int j = 0; j < 2; j++){ //x, y좌표니까
                axis[i][j] = Integer.parseInt(token.nextToken());
            }
        }
        br.close();

        int x_min = axis[0][0]; //2차원 배열 마지막 인덱스가 0인 것은 x좌표
        int x_max = axis[0][0];
        int y_min = axis[0][1]; //2차원 배열 마지막 인덱스가 1인 것은 y좌표
        int y_max = axis[0][1];

        //배열의 행의 크기 만큼 반복을 돌려 해당 x, y 좌표의 최소, 최댓값을 구한다.
        for(int i = 0; i < n; i++) {
            if (x_max < axis[i][0]) {
                x_max = axis[i][0];
            }

            if (x_min > axis[i][0]) {
                x_min = axis[i][0];
            }

            if (y_max < axis[i][1]) {
                y_max = axis[i][1];
            }

            if (y_min > axis[i][1]) {
                y_min = axis[i][1];
            }
        }

        System.out.println((x_max-x_min)*(y_max-y_min)); //면적구하기

    }
}
