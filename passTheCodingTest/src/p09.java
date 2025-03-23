// 10진수를 2진수로 변환하기

package src;

import java.util.Stack;

public class p09 {

    public static void main(String[] args) {
        int decimal1 = 10;
        int decimal2 = 27;
        int decimal3 = 12345;

        String binary1 = solution(decimal1);
        String binary2 = solution(decimal2);
        String binary3 = solution(decimal3);

        System.out.println(binary1);
        System.out.println(binary2);
        System.out.println(binary3);
    }

    public static String solution(int decimal) {
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            int i = decimal % 2;
            stack.push(i);
            decimal /= 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
