package recursion_basics;

public class NumberInArray {
	 public static boolean isNumberInArray(int[] arr, int number) {
	 if (arr.length == 0) {
	 return false;
	 }
	 if (arr[0] == number) {
	 return true;
	 }
	 int smallArr[] = new int[arr.length - 1];
	 for (int i = 1; i < arr.length; i++) {
	 smallArr[i - 1] = arr[i];
	 }
	 return isNumberInArray(smallArr, number);
	 }

	// Efficient solution
	public static boolean isNumberInArrayEfficient(int[] arr, int number, int startIndex) {
		if (arr.length == 0) {
			return false;
		}
		if (arr[startIndex] == number) {
			return true;
		}
		return isNumberInArrayEfficient(arr, number, startIndex + 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(isNumberInArrayEfficient(arr, 5,0));

	}

}
