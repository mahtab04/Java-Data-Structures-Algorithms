//https://leetcode.com/problems/concatenation-of-array/

package leetcode;

import java.util.*;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        for (int i = nums.length; i < res.length; i++) {
            res[i] = nums[i - nums.length];
        }
        return res;

    }

    public int[] getConcatenation2(int[] nums) {
        int[] result = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, 0, result, nums.length, nums.length);
        return result;
    }

    public static void main(String[] args) {
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] res = concatenationOfArray.getConcatenation(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        int[] res2 = concatenationOfArray.getConcatenation2(nums);
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + " ");
        }

    }
}
