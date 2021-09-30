package recursion_basics;

public class SplitArray {
	public static boolean splitArray(int arr[], int n, int start, int leftsum, int rightsum) {
		if (start == n) {
			return leftsum == rightsum;
		}
		if (arr[start] % 5 == 0)
			leftsum += arr[start];
		else if (arr[start] % 3 == 0)
			rightsum += arr[start];
		else
			return splitArray(arr, n, start + 1, leftsum + arr[start], rightsum)
					|| splitArray(arr, n, start + 1, leftsum, rightsum + arr[start]);

		return splitArray(arr, n, start + 1, leftsum, rightsum);

	}

	public static boolean splitArray(int[] arr) {

		return splitArray(arr, arr.length, 0, 0, 0);
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2 };
		int arr2[] = { 1, 4, 3 };

		System.out.println(splitArray(arr1));
		System.out.println(splitArray(arr2));

	}

}
