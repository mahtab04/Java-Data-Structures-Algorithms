package recursion_basics;

/**
 * @author Mahtab
 *
 */
public class RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String str) {
		if (str.length() <= 1)
			return str;
		if (str.charAt(0) == str.charAt(1))
			return removeConsecutiveDuplicates(str.substring(1));
		else
			return str.charAt(0) + removeConsecutiveDuplicates(str.substring(1));
	}

	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("abbcccdddd"));
	}

}
