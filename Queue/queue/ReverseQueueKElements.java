package queue;

import java.util.*;

public class ReverseQueueKElements {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {

		if (input.isEmpty())
			return input;
		if (input.size() == k || k > input.size())
			return input;
		Stack<Integer> stack = new Stack<Integer>();
		int n =input.size();
		for (int i = 0; i < k; i++) {
			stack.push(input.poll());
		}
		for (int i = 0; i < k; i++) {
			input.add(stack.pop());
		}
		for (int i = 0; i < n - k; i++) {
			input.add(input.poll());
		}
		return input;

	}

	public static void main(String[] args) {
		Queue<Integer> input = new LinkedList<Integer>();
		input.add(8);
		input.add(15);
		input.add(1);
		input.add(10);
		// input.add(5);
		input = reverseKElements(input, 1);
		System.out.println(input);
	}

}
