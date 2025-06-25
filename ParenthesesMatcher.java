import java.util.Stack;

public class ParenthesesMatcher {

    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "{[(])}";
        String expression3 = "{{[[(())]]}}";

        System.out.println(expression1 + " is balanced: " + isBalanced(expression1)); // Expected: true
        System.out.println(expression2 + " is balanced: " + isBalanced(expression2)); // Expected: false
        System.out.println(expression3 + " is balanced: " + isBalanced(expression3)); // Expected: true
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing parenthesis
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false; // Mismatched parentheses
                }
            }
        }

        return stack.isEmpty(); // True if all parentheses are matched
    }
}
