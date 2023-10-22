package stackQue;

import java.util.Arrays;

public class Stock {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length - 2; i++) {
            int cnt = 1;
            for(int j = i + 2; j < prices.length; j++) {
                if(prices[i] <= prices[j - 1] && prices[i] <= prices[j]) cnt++;
                else break;
            }
            answer[i] = cnt;
        }
        answer[prices.length - 2] = 1;
        answer[prices.length - 1] = 0;
        System.out.println(Arrays.toString(answer));
    }
}
