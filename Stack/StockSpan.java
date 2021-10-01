package stack;

import java.util.Stack;

public class StockSpan {
	public static int[] stockSpan(int input[]) {

		int[] result = new int[input.length];
		Stack<Integer> stack = new Stack<Integer>();
		result[0] = 1;
		stack.push(0);
		for (int i = 1; i < input.length; i++) {
			while (stack.size() > 0 && input[i] > input[stack.peek()]) {
				stack.pop();
			}
			if (stack.size() == 0) {
				result[i] = i + 1;
			} else {
				result[i] = i - stack.peek();
			}
			stack.push(i);
		}
		return result;

	}

	public static void main(String[] args) {
		int input[] = { 100, 80, 60, 70, 60, 75, 85 };
		int result[] = stockSpan(input);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
