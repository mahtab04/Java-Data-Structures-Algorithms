//https://leetcode.com/problems/kth-largest-element-in-an-array/
package leetcode;

import java.util.*;

public class KthLargestElement {
    public static int findKthLargest(int[] input, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i : input) {
            pq.add(i);
        }
        while (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();

    }

    public static void main(String[] args) {
        int input[] = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println(findKthLargest(input, k));
    }
}
