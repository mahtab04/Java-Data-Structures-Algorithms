//https://www.codechef.com/submit-v2/PROC18A
package codechef;

import java.util.*;

public class TheGreatRun {

    static int maxSubArray2(int arr[], int k) {

        int maxSum = 0;
        int winSum = 0;
        for (int i = 0; i < k; i++) {
            winSum += arr[i];
        }
        maxSum = winSum;
        for (int i = k; i < arr.length; i++) {
            winSum = winSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, winSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = maxSubArray2(arr, s);
            System.out.println(ans);

        }
        sc.close();
    }
}
