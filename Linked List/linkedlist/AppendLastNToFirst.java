package linkedlist;
//input

//4 4 7 8 3 36 8 17 26 7 7 

//n=7
//output
//3 36 8 17 26 7 7 4 4 7 8 

public class AppendLastNToFirst {
	public static Node<Integer> appendLastNnode(Node<Integer> head, int n) {
		if (head == null)
			return null;
		Node<Integer> temp1 = head;
		int len = 0;

		for (Node<Integer> temp = head; temp != null; temp = temp.next) {
			len++;
		}

		if (n == 0 || len < n) {
			return head;
		}

		Node<Integer> temp = head;
		for (int i = 0; i < len - n - 1 && temp != null; i++) {
			temp = temp.next;
		}
		head = temp.next;
		temp.next = null;

		Node<Integer> curr = head;

		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = temp1;
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(4);
		head.next = new Node<Integer>(4);
		head.next.next = new Node<Integer>(7);
		head.next.next.next = new Node<Integer>(8);
		head.next.next.next.next = new Node<Integer>(3);
		head.next.next.next.next.next = new Node<Integer>(36);
		head.next.next.next.next.next.next = new Node<Integer>(8);
		head.next.next.next.next.next.next.next = new Node<Integer>(17);
		head.next.next.next.next.next.next.next.next = new Node<Integer>(26);
		head.next.next.next.next.next.next.next.next.next = new Node<Integer>(7);
		head.next.next.next.next.next.next.next.next.next.next = new Node<Integer>(7);

		head = appendLastNnode(head, 7);
		for (Node<Integer> temp = head; temp != null; temp = temp.next)
			System.out.print(temp.data + " ");
	}
}
