package recursion_basics;

public class PalindromeChecker {

	// recursive method to check if a string is a palindrome
	public static boolean isPalindrome(String str) {
		if (str.length() <= 1) {
			return true;

		} else if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return isPalindrome(str.substring(1, str.length() - 1));
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		String str = "racecar";
		System.out.println(isPalindrome(str));

	}

}
