package recursion_basics;

public class Print_1_to_N {
public static void print(int n) {
	if(n==0)
		return;
	print(n-1);
	System.out.print(n+" ");
}
	public static void main(String[] args) {
		
		int n=10;
		print(n);

	}

}


