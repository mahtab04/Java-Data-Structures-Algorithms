//https://leetcode.com/problems/find-greatest-common-divisor-of-array/
package leetcode;

public class GCDofArray {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static int max(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;

    }

    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;

    }

    public static int findGCD(int[] nums) {
        int min = min(nums);
        int max = max(nums);
        int gcd = gcd(min, max);
        return gcd;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10 };
        int gcd = findGCD(nums);
        System.out.println(gcd);
    }

}
