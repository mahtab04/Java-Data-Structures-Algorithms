package linkedlist;

public class PrintIthNode {
	public static void printIthNode(Node<Integer> head, int i) {
		int pos = 0;
		Node<Integer> temp = head;
		while (temp != null) {
			if (pos == i) {
				System.out.println(temp.data);
				break;
			}
			temp = temp.next;
			pos++;
		}
	}

	public static void main(String[] args) {

		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);
		head.next.next.next.next.next = new Node<Integer>(6);

		printIthNode(head, 3);
	}

}
