import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                // (, [ : push
                if (c == '(' || c == '[') {
                    stack.push(c);
                }
                // ), ] : pop
                else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                }
                else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                }
            }

            // 괄호 균형 확인
            if (isBalanced && stack.isEmpty()) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }

        System.out.print(sb);
    }
}