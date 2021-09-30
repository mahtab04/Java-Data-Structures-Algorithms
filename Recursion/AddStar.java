package recursion_basics;

public class AddStar {
public static String addStars(String str) {
	if(str.length()<=1)
		return str;
	String result = addStars(str.substring(1));
	if(str.charAt(0)==result.charAt(0))
		return str.charAt(0)+"*"+result;
	else
		return str.charAt(0)+result;
}
	public static void main(String[] args) {
		
		String str ="aaa";
		System.out.println(addStars(str));

	}

}
