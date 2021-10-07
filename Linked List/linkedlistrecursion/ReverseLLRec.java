package linkedlistrecursion;

public class ReverseLLRec {
	public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		Node<Integer> temp = reverseLinkedListRec(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);
		head.next.next.next.next.next = new Node<Integer>(6);
		head = reverseLinkedListRec(head);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
