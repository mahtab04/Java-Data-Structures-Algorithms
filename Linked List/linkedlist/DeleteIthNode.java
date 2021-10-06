
package linkedlist;

/**
 * @author mahtab
 *
 */
public class DeleteIthNode {
	public static Node<Integer> deleteIthNode(Node<Integer> head, int pos) {
		if (head == null) {
			return null;
		}
		if (pos == 0) {
			head = head.next;
			return head;
		}
		Node<Integer> curr = head;
		for (int i = 0; i < pos - 1 && curr != null; i++)
			curr = curr.next;
		if (curr == null || curr.next == null)
			return head;
		curr.next = curr.next.next;
		return head;
	}

	public static void printList(Node<Integer> head) {
		Node<Integer> curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);
		// head.next.next.next.next.next = new Node<Integer>(6);
		// head.next.next.next.next.next.next = new Node<Integer>(7);
		System.out.println("Before deletion of node: ");
		printList(head);
		head = deleteIthNode(head, 5);
		System.out.println("After deletion of node: ");
		printList(head);
	}

}
