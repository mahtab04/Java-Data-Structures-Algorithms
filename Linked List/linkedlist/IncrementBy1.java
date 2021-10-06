package linkedlist;

public class IncrementBy1 {
	public static Node<Integer> rev(Node<Integer> head) {
		Node<Integer> curr = head, prev = null, next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static Node<Integer> nextLargeNumber(Node<Integer> head) {
		head = rev(head);
		boolean found = true;
		Node<Integer> curr = head;
		while (curr != null && found == true) {
			if (curr.next == null && curr.data == 9) {
				curr.data = 1;
				Node<Integer> temp = new Node<Integer>(0);
				temp.next = head;
				head = temp;
				curr = curr.next;
			} else if (curr.data == 9) {
				curr.data = 0;
				curr = curr.next;
			} else {
				curr.data = (curr.data) + 1;
				curr = curr.next;
				found = false;
			}
		}
		head = rev(head);
		return head;

	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(2);
		head.next = new Node<Integer>(3);
		head = nextLargeNumber(head);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
