package recursion_basics;

public class SumNaturalNumber {
public static int sum_N_Natural_Num(int n) {
	if(n==0)
		return 0;
	return n+sum_N_Natural_Num(n-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(sum_N_Natural_Num(n));
	}

}
