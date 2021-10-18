//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
package leetcode;
import java.util.*;

public class GreatestNumberCandies {
    //greatest in an array
    public static boolean isGreatest(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                return false;
            }
        }
        return true;
}
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if (isGreatest(candies, sum)) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> ans = kidsWithCandies(arr, extraCandies);
        System.out.println(ans);
    }
}
