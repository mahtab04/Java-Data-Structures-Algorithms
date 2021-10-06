package linkedlist;

public class LinkedListPrint {
	public static void printLinkedList(Node<Integer> head) {
		// Node<Integer> current = head;
		// while (current != null) {
		// System.out.print(current.data + " ");
		// current = current.next;

		// }
		for (Node<Integer> current = head; current != null; current = current.next) {
			System.out.print(current.data + " ");
		}
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);
		printLinkedList(head);

	}

}
