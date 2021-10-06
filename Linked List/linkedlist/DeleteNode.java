package linkedlist;

public class DeleteNode {
	public static void deleteNode(Node<Integer> node) {
		if (node == null)
			return;
		if (node.next == null) {
			node = null;
			return;
		}
		node.data = node.next.data;
		node.next = node.next.next;
	}

	// print ll
	public static void printLL(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);
		head.next.next.next.next.next = new Node<Integer>(6);
		head.next.next.next.next.next.next = new Node<Integer>(7);
		head.next.next.next.next.next.next.next = new Node<Integer>(8);
		System.out.println("Before deleting a given node: ");
		printLL(head);
		deleteNode(head.next);
		System.out.println("After deleting the given node: ");
		printLL(head);

	}
}
