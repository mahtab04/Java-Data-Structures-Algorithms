package linkedlist;

public class SwapTwoNodes {
	public static Node<Integer> swapTwoNodes(Node<Integer> head, int i, int j) {
		if (head == null || head.next == null || i == j) {
			return head;
		}

	

		if (i > j) {
			int temp = i;
			i = j;
			j = temp;
		}

		Node<Integer> curr1 = null, curr2 = null, prev1 = head, prev2 = head;
		for (int k = 0; k < i - 1 && head != null; k++) {
			prev1 = prev1.next;
		}
		curr1 = prev1.next;
		//
		for (int k = 0; k < j - 1 && head != null; k++) {
			prev2 = prev2.next;
		}
		curr2 = prev2.next;
		prev1.next = curr2;
		prev2.next = curr1;
		curr1.next = curr2.next;
		curr2.next = prev2;
		return head;
	}

	// print thr linked list
	public static void printList(Node<Integer> head) {
		Node<Integer> curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<>(3);
		head.next = new Node<>(4);
		head.next.next = new Node<>(5);
		head.next.next.next = new Node<>(2);
		head.next.next.next.next = new Node<>(6);
		head.next.next.next.next.next = new Node<>(1);
		head.next.next.next.next.next.next = new Node<>(9);

		printList(head);
		head = swapTwoNodes(head, 4, 2);
		printList(head);
	}

}
