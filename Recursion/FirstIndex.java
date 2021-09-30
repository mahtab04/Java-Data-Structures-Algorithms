package recursion_basics;

public class FirstIndex {
	//Naive Approach
	public static int firstIndex(int arr[], int num) {
		if (arr.length == 0)
			return -1;
		if (arr[0] == num)
			return 0;
		int smallArr[] = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++)
			smallArr[i - 1] = arr[i];
		int result = firstIndex(smallArr, num);
		if (result == -1)
			return result;
		else
			return result + 1;
	}

	// efficient version
	public static int firstIndexEff(int arr[], int num, int startIndex) {
		if (startIndex == arr.length)
			return -1;
		if (arr[startIndex] == num)
			return startIndex;
		int result = firstIndexEff(arr, num, startIndex + 1);
		if (result == -1)
			return result;
		else
			return result + 1;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 5, 6, 7, 8, 9 };
		int num = 5;
		System.out.println(firstIndex(arr, num));

	}

}
