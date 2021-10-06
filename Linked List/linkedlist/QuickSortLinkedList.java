package linkedlist;

public class QuickSortLinkedList {
    public static void SwapValue(Node<Integer> a, Node<Integer> b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;

    }

    public static Node<Integer> Partition(Node<Integer> start, Node<Integer> end) {
        int pivotValue = start.data;
        Node<Integer> p = start;
        Node<Integer> q = start.next;
        while (q != end) {
            if ((q.data) < pivotValue) {
                p = p.next;
                SwapValue(p, q);
            }
            q = q.next;
        }
        SwapValue(p, start);
        return p;
    }

    public static void QuickSort(Node<Integer> start, Node<Integer> end) {
        if (start != end) {
            Node<Integer> mid = Partition(start, end);
            QuickSort(start, mid);
            QuickSort(mid.next, end);
        }

    }

    public static Node<Integer> QuickSort(Node<Integer> head) {

        QuickSort(head, null);
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>(20);
        System.out.println(head);
        

    }

}
