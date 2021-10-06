package linkedlist;

public class EliminateDuplicate {
	public static Node<Integer> eliminateDuplicate(Node<Integer> head) {
		if (head == null) {
			return null;
		}
		Node<Integer> curr = head;
		while (curr != null && curr.next != null) {
			if ((curr.data).equals(curr.next.data)) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}

		}
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(10);
		head.next = new Node<Integer>(10);
		head.next.next = new Node<Integer>(10);
		head.next.next.next = new Node<Integer>(10);
		// head.next.next.next.next = new Node<Integer>(3);
		// head.next.next.next.next.next = new Node<Integer>(4);
		// head.next.next.next.next.next.next = new Node<Integer>(4);
		// head.next.next.next.next.next.next.next = new Node<Integer>(5);
		// head.next.next.next.next.next.next.next.next = new Node<Integer>(5);
		// head.next.next.next.next.next.next.next.next.next = new Node<Integer>(6);
		// head.next.next.next.next.next.next.next.next.next.next = new
		// Node<Integer>(6);
		Node<Integer> head1 = eliminateDuplicate(head);
		while (head1 != null) {
			System.out.println(head1.data);
			head1 = head1.next;
		}
	}

}
