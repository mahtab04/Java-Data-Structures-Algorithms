package linkedlist;

public class kReverse {
	public static Node<Integer> reverse(Node<Integer> head) {
		Node<Integer> prev = null;
		Node<Integer> curr = head;
		Node<Integer> next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	//reverse a linked list by k 
	public static Node<Integer> reverseK(Node<Integer> head, int k) {
		Node<Integer> prev = null;
		Node<Integer> curr = head;
		Node<Integer> next = null;
		int count = 0;
		while (curr != null && count < k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if (next != null) {
			head.next = reverseK(next, k);
		}
		return prev;
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
		head = reverseK(head, 3);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}
