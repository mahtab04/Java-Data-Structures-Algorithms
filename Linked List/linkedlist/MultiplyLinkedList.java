package linkedlist;

public class MultiplyLinkedList {
	// revesre the linked list
	public static Node<Integer> rev(Node<Integer> head) {
		if (head == null || head.next == null)
			return head;
		Node<Integer> curr = head, prev = null, next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	

	public static void main(String[] args) {
		

	}

}
