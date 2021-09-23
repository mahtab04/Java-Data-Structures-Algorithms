package arrays;

import java.util.*;

public class TransitionPoint {
    public static int transitionPoint(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 0) {
                low = mid + 1;
            } else if (arr[mid] == 1) {
                if (arr[mid - 1] == 0)
                    return mid;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(transitionPoint(arr));
        input.close();

    }
}

