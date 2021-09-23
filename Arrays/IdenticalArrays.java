package arrays;

import java.util.*;

public class IdenticalArrays {
    // Swap two elements in an array
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1]; // Store the first element
        array[index1] = array[index2]; // Store the second element
        array[index2] = temp; // Restore the first element
    }

    public static int minSwap(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                int j = i;
                while (arr2[j] != arr1[i]) {
                    j++;
                    if (j > arr2.length) {
                        return 0;
                    }

                }
                swap(arr2, i, j);
                count++;
            }
        
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }

        int res = minSwap(arr1, arr2);
        System.out.println(res);
        input.close();

    }
}
