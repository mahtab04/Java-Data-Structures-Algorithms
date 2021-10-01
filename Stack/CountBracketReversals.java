package stack;

import java.util.Stack;

public class CountBracketReversals {
	public static int countBracketReversals(String input) {
		if ((input.length()) % 2 != 0)
			return -1;
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char curr = input.charAt(i);
			if (curr == '{')
				stack.push(curr);
			else if (curr == '}') {
				if (stack.isEmpty())
					return -1;
				else {
					char top = stack.pop();
					if (top != '{')
						return -1;
					else
						count++;
				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		String str = "{{";
		System.out.println(countBracketReversals(str));

	}

}
