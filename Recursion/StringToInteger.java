package recursion_basics;

public class StringToInteger {
	public static int convertStringToInteger(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		int firstDigit = str.charAt(0) - '0';// Returns int value
		if (firstDigit != 0) {
			return firstDigit * (int) (Math.pow(10, str.length() - 1)) + convertStringToInteger(str.substring(1));
		} else {
			return convertStringToInteger(str.substring(1));
		}
	}

	public static void main(String[] args) {
		String str = "0012534";
		System.out.println(convertStringToInteger(str));

	}

}
