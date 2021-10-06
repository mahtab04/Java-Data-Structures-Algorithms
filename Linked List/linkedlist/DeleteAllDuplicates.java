package linkedlist;

public class DeleteAllDuplicates {
	//
	public static Node<Integer> deleteAllDuplicates(Node<Integer> head) {
		if (head == null)
			return head;
		if (head.next == null)
			return head;
		if (head.next.next == null)
			return head;
		Node<Integer> curr = head, prev = head;
		while (curr != null && curr.next != null) {
			if ((curr.data).equals(curr.next.data)) {
				prev.next = curr.next.next;
				curr = curr.next.next;

			} else {
				prev = curr;
				curr = curr.next;
			}
		}
		return head;
	}

	// print ll
	public static void printll(Node<Integer> head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		printll(head.next);
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(23);
		head.next = new Node<>(28);
		head.next.next = new Node<>(28);
		head.next.next.next = new Node<>(35);
		head.next.next.next.next = new Node<>(49);
		head.next.next.next.next.next = new Node<>(49);
		head.next.next.next.next.next.next = new Node<>(53);
		head.next.next.next.next.next.next.next = new Node<>(53);

		System.out.println("Before removing all duplicates: ");
		printll(head);
		System.out.println();
		System.out.println("After removing all Duplicates: ");
		head = deleteAllDuplicates(head);
		printll(head);

	}

}
