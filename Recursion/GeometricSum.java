package recursion_basics;

public class GeometricSum {
public static double geometricSum(int n) {
	if(n==0)
		return 1;
	double result = 1/(double)Math.pow(2, n);
	return result+geometricSum(n-1);
	
}
	public static void main(String[] args) {
		int n=4;
		System.out.println(geometricSum(n));
	
	}

}
