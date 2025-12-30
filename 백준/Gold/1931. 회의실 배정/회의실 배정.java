import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] meeting = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meeting[i][0] = Integer.parseInt(st.nextToken()); // start
            meeting[i][1] = Integer.parseInt(st.nextToken()); // end
        }

        Arrays.sort(meeting, (o1, o2) -> {
            // start 기준 (start == end인 경우)
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            // end 기준
            return o1[1] - o2[1];
        });

        int count = 0;
        int endTime = 0;

        for (int i = 0; i < n; i++) {
            if (meeting[i][0] >= endTime) {
                count++;
                endTime = meeting[i][1];
            }
        }

        System.out.println(count);
    }
}