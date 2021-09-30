package recursion_basics;

// Binary Search Recursive
public class BinarySearchRec {
	public static int binarySearchRec(int arr[], int startIndex, int endIndex, int key) {
		if (startIndex > endIndex)
			return -1;
		int midIndex = (startIndex + endIndex) / 2;
		if (arr[midIndex] == key)
			return midIndex;
		else if (arr[midIndex] > key)
			return binarySearchRec(arr, midIndex + 1, endIndex, key);
		else
			return binarySearchRec(arr, startIndex, midIndex - 1, key);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 5;
		int index = binarySearchRec(arr, 0, arr.length - 1, key);
		if (index == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index " + index);
	}

}
