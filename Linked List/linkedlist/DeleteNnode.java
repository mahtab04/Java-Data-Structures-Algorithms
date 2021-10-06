package linkedlist;

public class DeleteNnode {

	public static Node<Integer> deleteNnode(Node<Integer> head, int M, int N) {

		if (head == null || N < 1)
			return head;
		if (M < 1)
			return null;

		Node<Integer> curr = head, t;
		int count;
		while (curr != null) {
			for (count = 1; count < M && curr != null; count++) {
				curr = curr.next;
			}
			if (curr == null)
				return head;
			t = curr.next;
			for (count = 1; count <= N && t != null; count++) {
				t = t.next;
			}
			curr.next = t;
			curr = t;
		}
		return head;

	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		Node<Integer> temp = head;
		for (int i = 2; i <= 8; i++) {
			temp.next = new Node<Integer>(i);
			temp = temp.next;
		}
		Node<Integer> res = deleteNnode(head, 2, 3);
		while (res != null) {
			System.out.println(res.data);
			res = res.next;
		}
	}

}
