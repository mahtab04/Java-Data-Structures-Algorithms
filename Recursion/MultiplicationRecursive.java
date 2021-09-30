package recursion_basics;

public class MultiplicationRecursive {
public static int multiplicationRecursive(int m,int n) {
	if(n==0||m==0)
		return 0;
	return m+multiplicationRecursive(m, n-1);
}
	public static void main(String[] args) {
		System.out.println(multiplicationRecursive(3, 0));

	}

}
