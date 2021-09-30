package recursion_basics;

public class ReplaceChar {
	public static String replaceChar(String str, char a, char b) {
		if (str.length() == 0)
			return str;
		String result = replaceChar(str.substring(1), a, b);
		if (str.charAt(0) == a)
			return b + result;
		else
			return str.charAt(0) + result;

	}

	public static void main(String[] args) {
		System.out.println(replaceChar("abxcxdx", 'x', 'y'));

	}
}
