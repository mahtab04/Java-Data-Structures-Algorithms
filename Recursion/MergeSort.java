package recursion_basics;

/**
 * @author Mahtab
 *
 */
public class MergeSort {
	// merge function
	public static void merge(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}

	}

	// Recursive merge sort
	public static void mergeSort(int arr[]) {
		if (arr.length <= 1)
			return;
		int mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		for (int i = 0; i < mid; i++)
			left[i] = arr[i];
		for (int i = mid; i < arr.length; i++)
			right[i - mid] = arr[i];
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);
	}

	public static void main(String[] args) {
		int[] arr = { 8, 1, 8, 9, 2, 5, 4, 3, 1, 2 };
		mergeSort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
