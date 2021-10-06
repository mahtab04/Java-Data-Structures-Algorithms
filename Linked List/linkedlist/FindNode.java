package linkedlist;

public class FindNode {
	public static int findNode(Node<Integer> head, int data) {
		int pos = 0;
		Node<Integer> temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return pos;
			}
			temp = temp.next;
			pos++;
		}
		return -1;
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);
		head.next.next.next.next.next = new Node<Integer>(6);
		System.out.println(findNode(head, 6));
	}

}
