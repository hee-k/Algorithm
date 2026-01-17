import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] board = new int[5][5];
    static boolean[][] checkBoard = new boolean[5][5];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 빙고판
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 사회자가 부르는 숫자
        int count = 0;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                count++;

                // checkBoard 마킹
                for (int r = 0; r < 5; r++) {
                    for (int c = 0; c < 5; c++) {
                        if (board[r][c] == num) {
                            checkBoard[r][c] = true;
                        }
                    }
                }

                if (checkBingo() >= 3) {
                    System.out.println(count);
                    return;
                }
            }
        }
    }

    private static int checkBingo() {
        int bingo = 0;

        // 가로
        for (int i = 0; i < 5; i++) {
            if (checkBoard[i][0] && checkBoard[i][1] && checkBoard[i][2] && checkBoard[i][3] && checkBoard[i][4]) {
                bingo++;
            }
        }

        // 세로
        for (int j = 0; j < 5; j++) {
            if (checkBoard[0][j] && checkBoard[1][j] && checkBoard[2][j] && checkBoard[3][j] && checkBoard[4][j]) {
                bingo++;
            }
        }

        // 대각선 \
        if (checkBoard[0][0] && checkBoard[1][1] && checkBoard[2][2] && checkBoard[3][3] && checkBoard[4][4]) {
            bingo++;
        }

        // 대각선 /
        if (checkBoard[0][4] && checkBoard[1][3] && checkBoard[2][2] && checkBoard[3][1] && checkBoard[4][0]) {
            bingo++;
        }

        return bingo;
    }
}