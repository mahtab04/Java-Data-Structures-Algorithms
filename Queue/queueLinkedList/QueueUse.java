package queueLinkedList;

import java.util.*;

public class QueueUse {

	public static void main(String[] args) {
		// Queue<Integer> q = new LinkedList<Integer>();
		// for (int i = 1; i < 5; i++) {
		// q.add(10 + i);
		// }
		// System.out.print(q.poll() + " " + q.size());

		// }

		Queue<Integer> q = new LinkedList<Integer>();
		Stack<Integer> s = new Stack<Integer>();
		q.add(5);
		q.add(10);
		s.push(10);
		s.push(20);
		System.out.print(q.peek() + s.pop());

	}
}
