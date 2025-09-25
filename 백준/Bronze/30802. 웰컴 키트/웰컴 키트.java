import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringBuilder sb = new StringBuilder();

        // 총 참가자
        int n = Integer.parseInt(br.readLine());

        // 티셔츠 사이즈별 인원수
        int[] tSize = new int[6];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            tSize[i] = Integer.parseInt(st.nextToken());
        }

        // 묶음 단위
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        // 티셔츠 묶음
        int tBundle = 0;
        for (int i = 0; i < tSize.length; i++) {
            int cnt = tSize[i];
            tBundle += cnt / t;
            if (cnt % t != 0) tBundle += 1;
        }

        // 펜 묶음
        int pBundle = n / p;
        int pSingle = n % p;

        sb.append(tBundle).append('\n');
        sb.append(pBundle).append(' ').append(pSingle);

        System.out.println(sb.toString());
    }
}
