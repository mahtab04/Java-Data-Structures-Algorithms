package linkedlistrecursion;

public class FindNodeRec {
	// find the node with the given value recursively
	public static int findNodeRec(Node<Integer> head, int data) {
		if (head == null)
			return -1;
		if (head.data == data) {
			return 0;
		}
		int ans = findNodeRec(head.next, data);
		if (ans == -1)
			return -1;
		else
			return ans + 1;

	}

	// print linked list
	public static void printList(Node<Integer> head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		printList(head.next);
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		Node<Integer> temp = head;
		for (int i = 2; i < 10; i++) {
			temp.next = new Node<Integer>(i);
			temp = temp.next;
		}
		printList(head);
		System.out.println();
		System.out.println(findNodeRec(head, 5));
	}
}
