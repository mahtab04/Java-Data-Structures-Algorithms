package linkedlist;

import java.util.Scanner;

public class RemoveDupUnsortedList {

    // This function removes duplicates from a unsorted linked list 
    public static Node<Integer> removeDupUnsortedList(Node<Integer> head) {
        if (head == null) {
            return null;
        }
        Node<Integer> current = head, temp = head;
        while (current != null) {
            while (current != null && current.data == temp.data) {
                current = current.next;
            }
            temp.next = current;
            temp = current;

        }
        return head;
    }

    // print the list
    public static void printList(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    // take input
    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        Node<Integer> head = null, tail = null;
        int data;
        System.out.println("Enter the elements (one by one)");
        while (true) {

            data = s.nextInt();
            if (data == -1) {
                break;
            }
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();

        System.out.println("Before removing duplicates");
        printList(head);
        head = removeDupUnsortedList(head);
        System.out.println("After removing duplicates");
        printList(head);
    }
}
