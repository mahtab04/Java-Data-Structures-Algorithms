//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package leetcode;

public class EvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int count = (int) Math.floor(Math.log10(num) + 1);
            if (count % 2 == 0) {
                ans++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }
}
