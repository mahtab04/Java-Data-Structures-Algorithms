
public class StringPractice {

	public static void main(String[] args) {
		String s = "Mahtab Alam";
		System.out.println(s.toLowerCase());// convert string to lower case;
		System.out.println(s.trim());// remove white space from the string;
		System.out.println(s.substring(3, 7));// get substring from index 3 to 7;
		System.out.println(s.replace("a", "A"));// replace a with A;
		System.out.println(s.startsWith("M"));// check if string starts with M;
		System.out.println(s.lastIndexOf("m"));// get last index of m;

		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.equals(s2));// check if two strings are equal;
		String s3 = "abc";
		String s4 = "Abc";
		System.out.println(s3.equalsIgnoreCase(s4));// check if two strings are equal ignoring case;

		System.out.println(s1.concat(s4));// concatenate two strings;

		System.out.println(s1.compareTo(s4));// compare two strings;
		System.out.println(s1.length());// get length of string;
		System.out.println(s1.charAt(0));// get character at index 0;
		String str = "34567-12345";
		String splitStr[] = str.split("-");
		for (String a : splitStr)
			System.out.print(a);

	}

}
