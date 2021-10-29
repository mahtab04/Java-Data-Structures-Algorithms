//https://leetcode.com/problems/find-the-highest-altitude/
package leetcode;

public class HigestAltitude {
    public static int higestAltitude(int arr[]) {
        int max = 0;
        int currentAlt = 0;
        for (int i : arr) {
            currentAlt += i;
            max = Math.max(max, currentAlt);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { -4, -3, -2, -1, 4, 3, 2 };
        System.out.println(higestAltitude(arr));
    }
}
