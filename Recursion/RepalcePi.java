
package recursion_basics;

/**
 * @author Mahtab
 *
 */
public class RepalcePi {
	public static String replacePi(String str) {
		if (str.length() <= 1)
			return str;
		if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			String result = replacePi(str.substring(2));
			return "3.14" + result;
		} else {
			String result = replacePi(str.substring(1));
			return str.charAt(0) + result;
		}

	}

	public static void main(String[] args) {

		System.out.println(replacePi("abpipiedpwspidrpipi"));
	}

}
