package linkedlist;

public class EvenAfterOdd {
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		Node<Integer> evenHead = null;
		Node<Integer> oddHead = null;
		Node<Integer> evenTail = null;
		Node<Integer> oddTail = null;

		Node<Integer> temp = head;
		while (temp != null) {
			if (temp.data % 2 == 0) {
				if (evenHead == null) {
					Node<Integer> newNode = new Node<Integer>(temp.data);
					evenHead = newNode;
					evenTail = newNode;
				} else {
					evenTail.next = new Node<Integer>(temp.data);
					evenTail = evenTail.next;
				}
			} else {
				if (oddHead == null) {
					Node<Integer> newNode = new Node<Integer>(temp.data);
					oddHead = newNode;
					oddTail = newNode;
				} else {
					oddTail.next = new Node<Integer>(temp.data);
					oddTail = oddTail.next;
				}
			}
			temp = temp.next;
		}

		if (evenHead == null) {
			return oddHead;
		} else if (oddHead == null) {
			return evenHead;
		} else {
			oddTail.next = evenHead;
			return oddHead;
		}
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(4);
		head.next.next.next = new Node<Integer>(3);
		head.next.next.next.next = new Node<Integer>(5);
		head.next.next.next.next.next = new Node<Integer>(6);
		head.next.next.next.next.next.next = new Node<Integer>(10);
		head.next.next.next.next.next.next.next = new Node<Integer>(8);
		head.next.next.next.next.next.next.next.next = new Node<Integer>(9);
		head = evenAfterOdd(head);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
