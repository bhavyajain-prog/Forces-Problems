import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                char c1 = stack.pop();
                if (!((c == ')' && c1 == '(') || (c == '}' && c1 == '{') || (c == ']' && c1 == '['))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
