package step10;

import java.io.*;
import java.util.*;

public class B15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine()); //학교의 수
        System.out.print(4 * n);
    }
}
