package recursion_basics;

public class SumOfDigits {
	public static int sumOfDigits(int n) {
		if (n < 10) {
			return n;
		}
		return n % 10 + sumOfDigits(n / 10);
	}

	public static void main(String[] args) {
		int n = 12345;
		System.out.println(sumOfDigits(n));

	}

}
