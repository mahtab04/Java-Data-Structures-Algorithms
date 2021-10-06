package linkedlist;

public class MergeSortedLinkedList {
	// Merge two sorted linked lists recursively
	public static Node<Integer> mergeRec(Node<Integer> head1, Node<Integer> head2) {
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		if (head1.data < head2.data) {
			head1.next = mergeRec(head1.next, head2);
			return head1;
		} else {
			head2.next = mergeRec(head1, head2.next);
			return head2;
		}
	}

	// Merge two sorted linked lists
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
		Node<Integer> head = null;
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		if (head1.data < head2.data) {
			head = head1;
			head1 = head1.next;
		} else {
			head = head2;
			head2 = head2.next;
		}
		Node<Integer> temp = head;
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				temp.next = head1;
				head1 = head1.next;
			} else {
				temp.next = head2;
				head2 = head2.next;
			}
			temp = temp.next;
		}
		if (head1 != null)
			temp.next = head1;
		if (head2 != null)
			temp.next = head2;
		return head;
	}

	// Driver program to test above function
	public static void main(String[] args) {
		Node<Integer> head1 = new Node<Integer>(1);
		head1.next = new Node<Integer>(3);
		head1.next.next = new Node<Integer>(5);

		Node<Integer> head2 = new Node<Integer>(2);
		head2.next = new Node<Integer>(4);
		head2.next.next = new Node<Integer>(6);

		Node<Integer> head = merge(head1, head2);

		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}
