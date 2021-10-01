package stack;

import java.util.Stack;

public class BalancedParenthesis {
	// balanced parenthesis
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if (ch == ')' && top != '(') {
					return false;
				} else if (ch == '}' && top != '{') {
					return false;
				} else if (ch == ']' && top != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String str = "{{{[()]}}}";
		System.out.println(isBalanced(str));
	}

}
