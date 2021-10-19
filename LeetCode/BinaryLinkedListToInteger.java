//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
package leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class BinaryLinkedListToInteger {
    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    static int getDecimalValue(ListNode head) {
        ListNode reversed = reverse(head);
        int result = 0;
        String binary = "";
        while (reversed != null) {
            binary += reversed.val;
            reversed = reversed.next;
        }
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                result += Math.pow(2, i);
            }
        }
        return result;
    }
        

    //efficient solution
    public int getDecimalValueEff(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans = (ans << 1) | head.val;
            head = head.next;
        }
        return ans;
    }
public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(1);
    System.out.println(getDecimalValue(head));
}
}
