package stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;

    }
}

public class StackUisngLinkedList {
    private Node head;
    private int size;

    public StackUisngLinkedList() {
        this.size = 0;
        this.head = null;
    }

    // get the size
    public int getSize() {
        return this.size;
    }

    // check if stack is empty
    public boolean isEmpty() {
        return this.size == 0;
    }

    // push element into the stack
    public void push(int element) {
        Node newnode = new Node(element);
        if (isEmpty()) {
            this.head = newnode;
        } else {
            newnode.next = this.head;
            this.head = newnode;
        }
        this.size++;
    }

    // pop element from the stack
    public int pop() {

        if (this.head == null) {
            return -1;
        }
        // if (isEmpty()) {
        // return -1;
        // }
        int ans = this.head.data;
        this.head = this.head.next;
        this.size--;
        return ans;
    }

    // peek element from the stack
    public int peek() {
        if (this.head == null) {
            return -1;
        }
        return this.head.data;
    }

    // print the stack
    public void print() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
