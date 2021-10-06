package linkedlist;

public class LoopDetection {

	// Loop detection
	public static boolean hasLoop(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
	public static Node<Integer> getcycleStart(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		if (fast == null || fast.next == null) {
			return null;
		}
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
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
		head.next.next.next.next.next.next.next.next = new Node<Integer>(9);
		head.next.next.next.next.next.next.next.next.next = head.next.next.next.next.next.next.next;
		System.out.println(hasLoop(head));

	}

}
