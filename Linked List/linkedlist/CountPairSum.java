//i/p

//list1: 1 2 5 6 3 4
//list2: 11 13 12
//sum: 15
//o/p: 3
//exp (11,4), (12,3), (13,2)

package linkedlist;

import java.util.*;

public class CountPairSum {

    public static int countPairs(Node head1, Node head2, int sum) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (Node temp = head1; temp != null; temp = temp.next) {
            set.add(temp.data);
        }
        for (Node temp = head2; temp != null; temp = temp.next) {
            if (set.contains(sum - temp.data)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(11);
        head2.next = new Node(12);
        head2.next.next = new Node(13);

        System.out.println(countPairs(head1, head2, 15));

    }
}
