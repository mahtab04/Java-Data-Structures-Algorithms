package searching;

public class MergeSort {
	// MergeSort
	public static void merge(int arr[], int low, int high, int mid) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; i++)
			L[i] = arr[low + i];
		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];
		int i = 0, j = 0;
		int k = low;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void mergeSort(int arr[], int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, high, mid);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int n = arr.length;
		mergeSort(arr, 0, n - 1);
		System.out.println("Sorted array");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
