//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
package leetcode;

import java.util.*;

public class MaximumProduct {

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length - 1];
        int b = nums[nums.length - 2];
        int c = (a - 1) * (b - 1);
        return c;
    }

    public static int maxProduct1(int[] nums) {
        int m = Integer.MIN_VALUE, n = m;
        for (int num : nums) {
            if (num >= m) {
                n = m;
                m = num;
            } else if (num > n) {
                n = num;
            }
        }
        return (m - 1) * (n - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 4, 5 };
        System.out.println(maxProduct(nums));
    }
}
