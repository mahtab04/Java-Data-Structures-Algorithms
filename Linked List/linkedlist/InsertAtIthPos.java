package linkedlist;

public class InsertAtIthPos {
	public static Node<Integer> insertAtIthPos(Node<Integer> head, int data, int pos) {
		Node<Integer> newNode = new Node<Integer>(data);
		if (head == null) {
			return newNode;
		}
		if (pos == 0) {
			newNode.next = head;
			return newNode;
		}
		Node<Integer> temp = head;
		for (int i = 0; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}
		if (temp == null)
			return head;
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);

		head = insertAtIthPos(head, 6, 2);

	}

}
