package linkedlist;

public class linkedList1 {

	public static void main(String[] args) {
		Node<Integer> head = new Node<>(1);
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(3);

		head.next = node2;
		node2.next = node3;

	}

}
