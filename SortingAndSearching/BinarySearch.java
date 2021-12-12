package searching;
import java.util.*;
public class BinarySearch {


	//binary search for ascending order
	public static int binarySearch(int arr[], int x) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == x)
				return mid;
			else if (arr[mid] > x)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

//binary search for  descending order
	public static int binarySearchDescending(int arr[], int x) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == x)
				return mid;
			else if(arr[mid]>x)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
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

	// This function prints array
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		System.out.println("Enter a number to search in array: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int present = binarySearch(arr, x);
		if (present != -1)
			System.out.println(x + " is present in array.");
		else
			System.out.println(x + " is not present in array.");

		input.close();

	}

}

