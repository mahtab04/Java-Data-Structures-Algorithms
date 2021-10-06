package linkedlist;

import java.util.Scanner;

public class InputLinkedList {

	// function to input the elements of the linked list
	public static Node<Integer> inputLinkedList() {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		sc.close();
		return head;

	}

	public static void printLinkedList(Node<Integer> head) {
		for (Node<Integer> current = head; current != null; current = current.next) {
			System.out.print(current.data + " ");
		}
	}

	public static void main(String[] args) {
		Node<Integer> head = inputLinkedList();
		printLinkedList(head);

	}

}
