package linkedlist;

import java.util.*;

public class RemoveLoop {
    // detect loop in a linked list
    public static Node detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;

    }

    // remove loop in a linked list
    public static Node removeLoop(Node head) {
        Node loop = detectLoop(head);
        if (loop == null) {
            return head;
        }
        Node ptr1 = head;
        Node ptr2 = loop;
        while (ptr1.next != ptr2.next) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr2.next = null;
        return head;
    }

    // remove loop in a linked list using hashset
    public static Node removeLoopHashSet(Node head) {
        HashSet<Node> set = new HashSet<>();
        Node ptr = null;
        Node curr = head;
        while (curr != null) {
            if (set.contains(curr)) {
                ptr.next = null;
                return head;
            }
            set.add(curr);
            ptr = curr;
            curr = curr.next;

        }

        return head;

    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        head.next.next.next.next.next.next.next.next = head.next.next;

        Node loop = detectLoop(head);
        if (loop != null) {
            System.out.println("Loop detected at " + loop.data);
        } else {
            System.out.println("No loop detected");
        }

        head = removeLoopHashSet(head);
        System.out.println("Linked list after removing loop");
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
}