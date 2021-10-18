package leetcode;
//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum1dArray {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = nums[i];
            } else {
                result[i] = result[i - 1] + nums[i];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int result[] = runningSum(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    
    }
}
