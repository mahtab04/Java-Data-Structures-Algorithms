package arrays;

import java.util.*;

public class SortedSearch {
    // find Pivot of an array
    public static int pivot(int[] arr, int start, int end) {

        int mid = (start + end) / 2;
        if (arr[mid] > arr[mid + 1]) {
            return mid;
        } else {
            if (arr[start] > arr[mid]) {
                return pivot(arr, start, mid - 1);
            } else {
                return pivot(arr, mid + 1, end);
            }
        }

    }

    public static int solve(int[] arr, int key) {
        if (arr.length == 0)
            return -1;
        int pivot = pivot(arr, 0, arr.length - 1);
        int half = Arrays.binarySearch(arr, 0, pivot + 1, key);
        if (half >= 0) {
            return half;
        } else {
            int fihalf = Arrays.binarySearch(arr, pivot + 1, arr.length, key);
            if (fihalf >= 0) {
                return fihalf;
            } else {
                return -1;
            }
        }
    }

    // Efficient Solution
    public static int sortedSearchArray(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            // Check left side is sorted
            if (arr[low] <= arr[mid]) {
                // check if key is present in left side
                if (key >= arr[low] && key <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Check right side is sorted
            else {
                // check if key is present in right side
                if (key >= arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 0, 1, 2, 3 };
        int key = 5;
        int result = solve(arr, key);
        System.out.println(result);
        int result2 = sortedSearchArray(arr, key);
        System.out.println(result2);
    }
}

