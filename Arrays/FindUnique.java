package arrays;

import java.util.*;

public class FindUnique {
	// returns single occurring element
	public static int findUnique(int[] arr) {

		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result ^= arr[i];
		}
		return result;
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
		int uniqueEle = findUnique(arr);
		System.out.println(uniqueEle);
	}

}

