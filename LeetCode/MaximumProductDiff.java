//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
package leetcode;

import java.util.*;

public class MaximumProductDiff {
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1]);
    }// (NLOGN)

    // efficient solution O(N)
    public int maxProductDifferenceEff(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int val : nums) {
            if (val > max1) {
                max2 = max1;
                max1 = val;
            } else if (val > max2) {
                max2 = val;
            }

            if (val < min1) {
                min2 = min1;
                min1 = val;
            } else if (val < min2) {
                min2 = val;
            }
        }

        return (max1 * max2) - (min1 * min2);
    }

    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 7, 4 };
        System.out.println(maxProductDifference(nums));
    }
}
