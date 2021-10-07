package linkedlistrecursion;

public class PrintRecLinkedList {

	// Recursive function to print the linked list
	public static void printRecLinkedList(Node<Integer> head) {
		if (head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printRecLinkedList(head.next);
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);
		printRecLinkedList(head);
	}

}
