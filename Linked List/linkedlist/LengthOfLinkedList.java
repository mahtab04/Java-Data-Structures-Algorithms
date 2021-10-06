package linkedlist;

public class LengthOfLinkedList {
	public static int lengthLinkedList(Node<Integer> head) {
		int count = 0;
		for (Node<Integer> temp = head; temp != null; temp = temp.next) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);
		System.out.println(lengthLinkedList(head));

	}

}
