package arrays;

import java.util.*;

public class DistributionProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();
        Arrays.sort(arr);
        int minC = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            int diff = arr[i + k - 1] - arr[i];
            if (diff < minC) {
                minC = diff;
            }
        }
        System.out.println(minC);
        input.close();

    }
}

