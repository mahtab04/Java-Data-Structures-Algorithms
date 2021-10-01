package stack;

import java.util.Stack;

public class CheckRedundantBrackets {
	// check for redundant brackets

	public static boolean checkRedundantBrackets(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			if (curr == ')') {
				if (stack.peek() == '(') {
					return true;
				} else {
					while (stack.peek() != '(') {
						stack.pop();
					}
					stack.pop();

				}
			} else {
				stack.push(curr);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "a+(b)+c";
		System.out.println(checkRedundantBrackets(str));

	}

}
