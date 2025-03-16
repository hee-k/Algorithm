// https://school.programmers.co.kr/learn/courses/30/lessons/12909?language=java
// 올바른 괄호

package src;

import java.util.ArrayDeque;

public class p08 {

    public static void main(String[] args) {
        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

        p08 p = new p08();
        System.out.println(p.solution(s1));
        System.out.println(p.solution(s2));
        System.out.println(p.solution(s3));
    }
    public boolean solution(String s) {
        boolean answer = true;

        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== '(') {
                stack.push(arr[i]);
            } else {
                if (stack.isEmpty() || stack.pop() == arr[i]) {
                    return false;
                }
            }
        }
        answer = stack.isEmpty();
        return answer;
    }
}
