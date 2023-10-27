package step6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        Double calculation = 0.0;
        Double creditSum = 0.0;

        for(int i = 0; i < 20; i++) {
            String str = sc.nextLine();
            String[] input = str.split(" ");
            if (input[2].equals("P")) continue;
            calculation += map.get(input[2]) * Double.parseDouble(input[1]);
            creditSum += Double.parseDouble(input[1]);
        }
        System.out.println(calculation / creditSum);

    }
}
