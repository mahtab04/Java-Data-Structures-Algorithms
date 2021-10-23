package arrays;

//i/p
//6
//2 6 8 5 4 3
//4
//2 3 4 7

//2
//10 10
//1
//10

//o/p

//2 4 3

//10
import java.util.*;

public class ArrayIntersection {
    // This function calculate array Intersection
    public static void intersections(int arr1[], int arr2[]) {

        int val = Integer.MIN_VALUE;
        for (int i = 0; i < (arr1.length); i++) {
            for (int j = 0; j < (arr2.length); j++) {
                if (arr1[i] == arr2[j]) {

                    System.out.print(arr1[i]);
                    System.out.print(" ");
                    arr2[j] = val;
                    break;
                }

            }

        }
    }

    // Efficient Method of Array Intersection
    public static void arrayIntersection(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int m = arr1.length, n = arr2.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i]);
                System.out.print(" ");
                j++;
                i++;

            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }

        }
    }

    // Array Intersection using hashmap
    public static void arrayIntersectionUsingHashMap(int arr1[], int arr2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
                System.out.print(arr2[i]);
                System.out.print(" ");
                map.put(arr2[i], map.get(arr2[i]) - 1);
            }
        }
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
        int arr1[] = takeInput();
        int arr2[] = takeInput();
        intersections(arr1, arr2);
    }
}
