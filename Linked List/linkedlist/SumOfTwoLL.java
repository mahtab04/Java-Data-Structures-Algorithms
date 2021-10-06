package linkedlist;

public class SumOfTwoLL {

	// revesre the linked list
	public static Node<Integer> rev(Node<Integer> head) {
		Node<Integer> curr = head, prev = null, next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	// Add two linked List of integers and return the sum as a linked list
	public static Node<Integer> addNumbers(Node<Integer> head1, Node<Integer> head2) {
		if (head1 == null && head2 == null) {
			return null;
		}

		if (head1 == null) {
			return head2;
		}

		if (head2 == null) {
			return head1;
		}

		head1 = rev(head1);
		head2 = rev(head2);
		int sum = 0, carry = 0;
		Node<Integer> temp, res = null, curr1 = null;
		while (head1 != null || head2 != null) {
			sum = carry + (head1 == null ? 0 : head1.data) + (head2 == null ? 0 : head2.data);
			carry = (sum >= 10) ? 1 : 0;
			sum = sum % 10;
			temp = new Node<Integer>(sum);
			if (res == null) {
				res = temp;
				curr1 = temp;
			} else {
				curr1.next = temp;
				curr1 = temp;
			}
			if (head1 != null) {
				head1 = head1.next;
			}
			if (head2 != null) {
				head2 = head2.next;
			}
		}
		if (carry == 1) {
			temp = new Node<Integer>(1);
			curr1.next = temp;
		}
		return rev(res);
	}

	public static void main(String[] args) {
		Node<Integer> head1 = new Node<Integer>(4);
		head1.next = new Node<Integer>(5);
		head1.next.next = new Node<Integer>(6);
		head1.next.next.next = new Node<Integer>(7);
		Node<Integer> head2 = new Node<Integer>(6);
		head2.next = new Node<Integer>(7);
		head2.next.next = new Node<Integer>(8);
		head2.next.next.next = new Node<Integer>(9);
		Node<Integer> res = addNumbers(head1, head2);
		while (res != null) {
			System.out.print(res.data + " ");
			res = res.next;
		}
	}
}
