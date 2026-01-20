import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());  // 낮 (up)
        int b = Integer.parseInt(st.nextToken());  // 밤 (down)
        int v = Integer.parseInt(st.nextToken());  // 높이

        int height = v - a;
        int dailyHeight = a - b;
        int day;

        if (height <= 0) {
            day = 0;
        } else if (height % dailyHeight == 0) {
            day = height / dailyHeight;
        } else {
            day = height / dailyHeight + 1;
        }

        int result = day + 1;

        System.out.println(result);
    }
}