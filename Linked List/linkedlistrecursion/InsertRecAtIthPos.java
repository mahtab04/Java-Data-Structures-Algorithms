package linkedlistrecursion;

public class InsertRecAtIthPos {

	// public static void fun(Node<Integer> head) {
	// if(head==null)
	// return;
	// System.out.println(head.data);
	// if (head.next != null) {
	// fun(head.next.next);
	// System.out.println(head.data);
	// }
	// }

	// insert a node at ith position in a linked list recursively
	public static Node<Integer> insertRecAtIthPos(Node<Integer> head, int data, int pos) {
		if (head == null) {
			return null;
		}

		if (pos == 0) {
			Node<Integer> newNode = new Node<Integer>(data);
			newNode.next = head;
			return newNode;
		}
		head.next = insertRecAtIthPos(head.next, data, pos - 1);
		return head;
	}

	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
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
		Node<Integer> newHead = insertRecAtIthPos(head, 7, 20);
		System.out.println("Original Linked List");
		printLL(head);
		System.out.println("New Linked List");
		printLL(newHead);

	}

}
