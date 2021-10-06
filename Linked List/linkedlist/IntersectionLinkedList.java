package linkedlist;

public class IntersectionLinkedList {
	public static int lengthLL(Node<Integer> head) {
		int length = 0;
		for (Node<Integer> curr = head; curr != null; curr = curr.next) {
			length++;
		}
		return length;
	}

	public static int findIntersection(Node<Integer> firstHead, Node<Integer> secondHead) {
		int length1 = lengthLL(firstHead);
		int length2 = lengthLL(secondHead);
		int diff = Math.abs(length1 - length2);
		
		if (length1 > length2) {
			while (diff-- > 0) {
				firstHead = firstHead.next;

			}
		} else {
			while (diff-- > 0) {
				secondHead = secondHead.next;
			}

		}
		while (firstHead != null && secondHead != null) {
			if (firstHead == secondHead) {
				return firstHead.data;
			}
			firstHead = firstHead.next;
			secondHead = secondHead.next;
		}
		return -1;
	}

	public static void main(String[] args) {
		Node<Integer> firstHead = new Node<>(2);
		firstHead.next = new Node<>(6);
		firstHead.next.next = new Node<>(4);
		// firstHead.next.next.next = new Node<>(2);
		Node<Integer> secondHead = new Node<>(1);
		secondHead.next = new Node<>(5);
		// secondHead.next.next = new Node<>(1);
		// secondHead.next.next.next = new Node<>(1);
		System.out.println(findIntersection(firstHead, secondHead));

	}

}
