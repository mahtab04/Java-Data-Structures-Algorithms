package stack;

import java.util.Stack;

public class ReverseStack {
	public static void insertAtBottom(Stack<Integer> stack, int x) {

		if (stack.isEmpty()) {
			stack.push(x);
			return;
		}

		int y = stack.pop();

		insertAtBottom(stack, x);

		stack.push(y);
	}

	public static void reverse(Stack<Integer> stack) {

		if (stack.isEmpty() == false) {
			int x = stack.pop();
			reverse(stack);

			insertAtBottom(stack, x);
		}
	}

	public static void reverseStack(Stack<Integer> input, Stack<Integer> helper) {
		int temp = input.pop();
		reverse(input);
		for (int ele : input) {
			helper.push(ele);
		} 
		input.clear();
		input.push(temp);
		for (int ele : helper) {
			input.push(ele);
		}

	}

	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>();
		Stack<Integer> helper = new Stack<Integer>();
		input.push(1);
		input.push(2);
		input.push(3);
		input.push(4);
		input.push(5);
		input.push(10);

		System.out.println("After reverse:");
		reverseStack(input, helper);
		while (!input.isEmpty()) {
			System.out.print(input.pop() + " ");
		}
		System.out.println();

	}
}
