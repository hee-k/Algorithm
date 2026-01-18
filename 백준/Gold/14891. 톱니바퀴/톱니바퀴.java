import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] gear = new int[4][8];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            String s = br.readLine();
            for (int j = 0; j < 8; j++) {
                gear[i][j] = s.charAt(j) - '0'; // 0 or 1
            }
        }

        int k = Integer.parseInt(br.readLine()); // 회전 횟수

        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int no = Integer.parseInt(st.nextToken()) - 1;      // 톱니바퀴 번호
            int direction = Integer.parseInt(st.nextToken());   // 방향

            rotate(no, direction);
        }

        int score = 0;
        if (gear[0][0] == 1) score += 1;
        if (gear[1][0] == 1) score += 2;
        if (gear[2][0] == 1) score += 4;
        if (gear[3][0] == 1) score += 8;

        System.out.println(score);
    }

    private static void rotate(int no, int direction) {
        int[] dir = new int[4];
        dir[no] = direction; // 1 : 시계, -1 : 반시계

        // 왼쪽
        for (int i = no-1; i >= 0; i--) {
            if (gear[i][2] != gear[i + 1][6]) {
                dir[i] = -dir[i + 1];
            } else {
                break;
            }
        }

        // 오른쪽
        for (int i = no+1; i < 4; i++) {
            if (gear[i - 1][2] != gear[i][6]) {
                dir[i] = -dir[i - 1];
            } else {
                break;
            }
        }

        // 재배치
        for (int i = 0; i < 4; i++) {
            if (dir[i] == 1) {
                rotateRight(i);
            } else if (dir[i] == -1) {
                rotateLeft(i);
            }
        }
    }

    // 시계 방향
    private static void rotateRight(int num) {
        int temp = gear[num][7];
        for (int i = 7; i > 0; i--) {
            gear[num][i] = gear[num][i - 1];
        }
        gear[num][0] = temp;
    }

    // 반시계 방향
    private static void rotateLeft(int num) {
        int temp = gear[num][0];
        for (int i = 0; i < 7; i++) {
            gear[num][i] = gear[num][i + 1];
        }
        gear[num][7] = temp;
    }
}