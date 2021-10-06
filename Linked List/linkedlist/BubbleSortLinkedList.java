package linkedlist;

public class BubbleSortLinkedList {
	// Function for bubble sort of linked list
	public static Node<Integer> bubbleSort(Node<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> temp = head;
		while (temp.next != null) {
			Node<Integer> temp1 = head;
			while (temp1.next != null) {
				if (temp1.data > temp1.next.data) {
					int temp1Data = temp1.data;
					temp1.data = temp1.next.data;
					temp1.next.data = temp1Data;
				}
				temp1 = temp1.next;
			}
			temp = temp.next;
		}
		return head;

	}

	// print linked list
	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(10);
		head.next.next = new Node<Integer>(2);
		head.next.next.next = new Node<Integer>(7);
		head.next.next.next.next = new Node<Integer>(5);
		head.next.next.next.next.next = new Node<Integer>(1);
		head.next.next.next.next.next.next = new Node<Integer>(4);
		head.next.next.next.next.next.next.next = new Node<Integer>(8);
		System.out.println("Before sorting");
		print(head);
		head = bubbleSort(head);
		System.out.println("\nAfter sorting");
		print(head);

	}

}
