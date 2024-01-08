package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B12891 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int result = 0;

        char a[] = new char[s];
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;

        a = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) checkSecret++;
        }
        for (int i = 0; i < p; i++) {
            Add(a[i]);
        }
        if (checkSecret == 4) result++;

        for (int i = p; i < s; i++) {
            int j = i - p;
            Add(a[i]);
            Remove(a[j]);
            if (checkSecret == 4) result++;
        }
        System.out.println(result);
        bf.close();
    }

    // 추가된 문자열 처리
    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0])
                    checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1])
                    checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2])
                    checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3])
                    checkSecret++;
                break;
        }
    }

    // 제거된 문자열 처리
    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0])
                    checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1])
                    checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2])
                    checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3])
                    checkSecret--;
                myArr[3]--;
                break;
        }
    }
}
