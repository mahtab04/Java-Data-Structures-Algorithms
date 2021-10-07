package linkedlistrecursion;

public class DelAtIthPosRec {
	public static Node<Integer> delAtIthPosRec(Node<Integer> head, int pos) {
		if (head == null)
			return head;
		if (pos == 0)
			return head.next;
		head.next = delAtIthPosRec(head.next, pos - 1);
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
		System.out.println("Before Deletion of a node: ");
		printLL(head);
		head = delAtIthPosRec(head, 2);
		System.out.println("After Deletion of a node: ");
		printLL(head);

	}

}
