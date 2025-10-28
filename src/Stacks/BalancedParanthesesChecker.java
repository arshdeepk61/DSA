package Stacks;

import java.util.Stack;

//WAP to check whether a given string of paranthesis is balanced
// Input-> () -> Balanced
//Input- {} -> Balanced
//Input- {[()]} -> Balanced
//Input- {[(])} -> Not balanced
public class BalancedParanthesesChecker {
    public static void main(String[] args) {

        String expr1 = "{[()]}";
        String expr2 = "{[(])}";

        System.out.println(expr1 + " -> " + (isBalanced(expr1) ? "Balanced" : "Not balanced"));
        System.out.println(expr1 + " -> " + (isBalanced(expr2) ? "Balanced" : "Not balanced"));
    }

    private static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Will change string ton character array
        for (char ch : expression.toCharArray()) {
            //Push opening brackets into stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            //Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;  // No opening bracket to match
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        ch == '}' && top != '{' ||
                        ch == ']' && top != '[') {
                    return false; //mismatched pair
                }
            }

        }
        return stack.isEmpty();
    }
}
