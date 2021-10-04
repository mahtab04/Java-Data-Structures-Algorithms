package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
	public static void reverseQueue(Queue<Integer> input) {
		// reverse the queue
		if (input.size() != 0) {
			int x = input.peek();
			input.poll();
			reverseQueue(input);
			input.add(x);
		}
	}

	public static void main(String[] args) {
		Queue<Integer> input = new LinkedList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		reverseQueue(input);
		System.out.println(input);
	}
}
