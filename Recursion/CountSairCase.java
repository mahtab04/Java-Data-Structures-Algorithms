package recursion_basics;

public class CountSairCase {
public static int countStairCase(int n) {
	if(n<0)
		return 0;
	if(n==0)
		return 1;
	else
		return countStairCase(n-1)+countStairCase(n-2)+countStairCase(n-3);
}
	public static void main(String[] args) {
		int n=5;
		System.out.println(countStairCase(n));

	}
}
