package linkedlist;

public class PalindromeLinkedList {
	public static Node<Integer> middleLinkedList(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node<Integer> reverseLinkedList(Node<Integer> head) {
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

	public static boolean isPlaindrome(Node<Integer> head) {
		if (head == null || head.next == null)
			return true;
		Node<Integer> mid = middleLinkedList(head);
		Node<Integer> rev = reverseLinkedList(mid);
		while (head != null && rev != null) {
			if (head.data != rev.data)
				return false;
			head = head.next;
			rev = rev.next;
		}
		return true;
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(2);
		head.next.next.next.next = new Node<Integer>(1);
		System.out.println(isPlaindrome(head));
	}
}
