//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

package leetcode;

import java.util.Scanner;

public class DeleteMiddleNode {

    //this function deletes the middle node of a linked list
    public static Node<Integer> deleteMiddleNode(Node<Integer> head) {
        if (head == null || head.next == null)
            return null;
        Node<Integer> slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow.next == null) {
            head.next = null;
            return head;
        }
        slow.data = slow.next.data;
        slow.next = slow.next.next;
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
        System.out.println("Enter the elements (one by one & -1 to terminate)");
        while (true) {

            data = s.nextInt();
            if (data == -1) {
                break;
            }
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        System.out.println("Given linked list");
        printList(head);
        head = deleteMiddleNode(head);
        System.out.println("\nLinked list after deleting middle node");
        printList(head);

    }
}
