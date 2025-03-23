// https://school.programmers.co.kr/learn/courses/30/lessons/76502language=java
// 괄호 회전하기

package src;

import java.util.ArrayDeque;
import java.util.HashMap;

public class p10 {

    public static void main(String[] args) {
        String example1 = "[](){}";
        String example2 = "}]()[{";
        String example3 = "[)(]";
        String example4 = "}}}";

        System.out.println(solution(example1));
        System.out.println(solution(example2));
        System.out.println(solution(example3));
        System.out.println(solution(example4));
    }

    public static int solution(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        int n = s.length();
        s += s;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            boolean isValid = true;
            for (int j = i; j < i + n; j++) {
                char c = s.charAt(j);

                if (map.containsValue(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || stack.pop() != map.get(c)) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid && stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
