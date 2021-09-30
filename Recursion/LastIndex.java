package recursion_basics;

public class LastIndex {
	// Find the index of the last occurrence of a character in a Array
	public static int lastIndex(int arr[], int num) {
		if (arr.length == 0) {
			return -1;
		}

		int smallArr[] = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		int result = lastIndex(smallArr, num);
		if (result != -1) {
			return result + 1;
		} else {
			if (arr[0] == num)
				return 0;
			else
				return -1;
		}
	}

	// Efficient version of lastIndex
	public static int lastIndexEfficient(int arr[], int num, int startIndex) {

		if (startIndex == arr.length) {
			return -1;
		}
		int result = lastIndexEfficient(arr, num, startIndex + 1);
		if (result != -1) {
			return result + 1;
		} else {
			if (arr[startIndex] == num)
				return startIndex;
			else
				return -1;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 21, 22, 46, 12, 61, 21, 33, 16, 99, 96 };
		int num = 25;
		int result = lastIndex(arr, num);
		System.out.println(result);
	}

}
