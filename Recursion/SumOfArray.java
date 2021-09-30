package recursion_basics;

public class SumOfArray {
	// public static int sumElement(int arr[]) {
	// if (arr.length == 0)
	// return 0;
	// int smallArr[] = new int[arr.length - 1];
	// for (int i = 1; i < arr.length; i++) {
	// smallArr[i - 1] = arr[i];
	// }

	// return arr[0] + sumElement(smallArr);
	// }

	// Efficient way to find sum of array
	public static int sumElementEfficient(int arr[], int startIndex) {
		if (arr.length == 0)
			return 0;
		if (startIndex == arr.length - 1)
			return arr[startIndex];
		return arr[startIndex] + sumElementEfficient(arr, startIndex + 1);
	}

	public static void main(String[] args) {

		int arr[] = { 9, 8, 9 };
		System.out.println(sumElementEfficient(arr, 0));
	}

}
