package arrays;

public class Sort012 {

	public static void sort012(int arr[]) {
		int low = 0, mid = 0, high = arr.length - 1;
		while (mid <= high) {

			if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			}

			else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 0, 1, 0, 2, 1, 0 };
		sort012(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

}
