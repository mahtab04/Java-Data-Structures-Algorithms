package recursion_basics;

public class RemoveChar {
	public static String removeChar(String str, char a) {
		if (str.length() == 0)
			return str;
		String result = removeChar(str.substring(1), a);
		if (str.charAt(0) == a)
			return result;
		else
			return str.charAt(0) + result;

	}

	public static void main(String[] args) {
		System.out.print(removeChar("xaxb", 'x'));
	}
}
