//https://leetcode.com/problems/number-of-good-pairs/
package leetcode;
import java.util.*;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int count = 0;
        for (int n : nums) {
            if (hs.containsKey(n)) {
                int k = hs.get(n);
                count += k;
                hs.put(n, k + 1);
            } else {
                hs.put(n, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 1, 3 };
        System.out.println(numIdenticalPairs(nums));
    }
}
