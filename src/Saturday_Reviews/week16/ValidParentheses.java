package week16;

import java.util.Stack;

/*
BalancedBrackets. [], {}, ()
[] -> valid
() -> valid
[]{} -> valid
{[()]} -> valid
[} -> invalid
[][][](())
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("(}"));
        System.out.println(isValid("[()]"));
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("([})"));
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()) {
            if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
