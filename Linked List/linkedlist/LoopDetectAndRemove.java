package linkedlist;

public class LoopDetectAndRemove {
	public static Node<Integer> loopNode(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;

	}

	public static void removeLoop(Node<Integer> head) {
		Node<Integer> slow = loopNode(head);
		Node<Integer> curr = head;
		while (slow.next != curr) {
			slow = slow.next;
			curr = curr.next;
		}
		slow.next = null;

	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);
		head.next.next.next.next.next = new Node<Integer>(6);
		head.next.next.next.next.next.next = new Node<Integer>(7);
		head.next.next.next.next.next.next.next = head.next.next.next.next;

		removeLoop(head);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}
