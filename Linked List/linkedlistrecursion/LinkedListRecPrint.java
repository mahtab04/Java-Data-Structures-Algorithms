package linkedlistrecursion;

public class LinkedListRecPrint {

	// fuction to print the reverse of the linked list recursively
	public static void printRevRec(Node<Integer> head) {
		if (head == null) {
			return;
		}
		printRevRec(head.next);
		System.out.print(head.data + " ");
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);
		printRevRec(head);
	}

}
