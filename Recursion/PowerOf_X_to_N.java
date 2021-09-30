/**
 * 
 */
package recursion_basics;

/**
 * @author mahta
 *
 */
public class PowerOf_X_to_N {

	/**
	 * @param args
	 */
	public static int power(int x,int n) {
		if(n==0)
			return 1;
		return x*power(x,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3,n=4;
		System.out.println(power(x, n));

	}

}
