package arrays;

import java.util.*;

public class DuplicateInArr {
    // This function retuns duplicate number present in array
    // Naive Solution
    public static int duplicateNumber(int arr[]) {

        int dup = 0;
        for (int i = 0; i < (arr.length); i++) {
            for (int j = i + 1; j < (arr.length); j++) {
                if (arr[j] == arr[i])
                    dup = arr[j];
            }
        }
        return dup;

    }

    // Efficient Sol
    public static int findDuplicate(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int result = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                result = arr[i];

        }
        return result;
    }

    // using HashSet
    public static int findDuplicateUsingHashSet(int[] arr) {
        // Your code goes here
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i]))
                return arr[i];
        }
        return -1;
    }

    // using HashMap
    public static int findDuplicateUsingHashMap(int[] arr) {
        // Your code goes here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                return arr[i];
            else
                map.put(arr[i], 1);
        }
        return -1;
    }

    // using Bit Manipulation
    public static int findDuplicateUsingBitManipulation(int[] arr) {
        // Your code goes here
        int n = arr.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
        }
        int xor1 = 0;
        for (int i = 0; i < n; i++) {
            xor1 ^= i;
        }
        return xor ^ xor1;
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

    public static void main(String[] args) {
        int arr[] = takeInput();
        //int duplicateNumber = duplicateNumber(arr);
        int dup = findDuplicate(arr);
        System.out.println(dup);
    }
}

