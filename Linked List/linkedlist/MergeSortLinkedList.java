package linkedlist;

public class MergeSortLinkedList {

	// Find the middle of linked list
	public static Node<Integer> middleLinkedList(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	// Merge two sorted linked lists recursively
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

	// Merge sort a linked list
	public static Node<Integer> mergeSort(Node<Integer> head) {
		if (head == null || head.next == null)
			return head;
		Node<Integer> middle = middleLinkedList(head);
		Node<Integer> next = middle.next;
		middle.next = null;
		Node<Integer> left = mergeSort(head);
		Node<Integer> right = mergeSort(next);
		return merge(left, right);
	}

	// Print the linked list
	public static void printLinkedList(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(3);
		head.next.next = new Node<Integer>(7);
		head.next.next.next = new Node<Integer>(8);
		head.next.next.next.next = new Node<Integer>(2);
		head.next.next.next.next.next = new Node<Integer>(0);
		head.next.next.next.next.next.next = new Node<Integer>(1);
		head.next.next.next.next.next.next.next = new Node<Integer>(15);
		System.out.println("Before sorting of linked list: ");
		printLinkedList(head);
		mergeSort(head);
		System.out.println("After sorting the linked list: ");

		printLinkedList(head);

	}

}
