package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        mData[] a = new mData[n];
        for (int i = 0; i < n; i++) {
            a[i] = new mData(Integer.parseInt(reader.readLine()), i);
        }
        Arrays.sort(a);
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < a[i].index - i)
                max = a[i].index - i;
        }
        System.out.println(max + 1);
    }
}

class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    }
}
