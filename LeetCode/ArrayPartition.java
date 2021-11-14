package leetcode;

import java.util.*;
public class ArrayPartition {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ans += nums[i];
            
        }
        return ans;
        
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 3, 4 };
        System.out.println(arrayPairSum(nums));
    }
    
}
