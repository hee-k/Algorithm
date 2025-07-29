// https://school.programmers.co.kr/learn/courses/30/lessons/12973language=java
// 짝지어 제거하기

package src;

import java.util.Stack;

public class p11 {

    public static void main(String[] args) {
        String s1 = "baabaa";
        String s2 = "cdcd";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}

// test commit
