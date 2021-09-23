package arrays;

import java.util.*;

public class PairSum {

    // This function calcultes no of pair sum in an array.
    // Naive Solutin
    // public static int pairSum(int arr[], int x) {
    // // Your code goes here
    // int count = 0;
    // for (int i = 0; i < (arr.length); i++) {
    // for (int j = i + 1; j < (arr.length); j++) {
    // if ((arr[i] + arr[j]) == x)
    // count++;
    // }
    // }
    // return count;
    // }

    // Efficient Soln
    public static int pairSum(int arr[], int num) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int count = 0;
        while (i < j) {
            if ((arr[i] + arr[j]) == num) {
                count++;
                i++;
                j--;
            } else if ((arr[i] + arr[j]) > num) {
                j--;
            } else {
                i++;
            }
        }
        return count;

    }

    // This function takes input from the user and store in array;
    public static int[] takeInput() {
        System.out.println("Enter the size of array: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        return arr;

    }
    //Efficient Solution
    

    public static void main(String[] args) {
        int arr[] = takeInput();
        //int sum = 6;
        int result = pairSum(arr, 6);
        System.out.println(result);
    }
}
