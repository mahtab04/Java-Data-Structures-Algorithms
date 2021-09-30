package recursion_basics;

public class CountZeros {
	public static int countZeros(int n) {
		if (n < 10) {
			if (n == 0)
				return 1;
			else
				return 0;
		}
		int lastdigit = n % 10;
		if (lastdigit == 0)
			return 1 + countZeros(n / 10);
		else
			return countZeros(n / 10);

	}

	public static void main(String[] args) {
		int n = 10320;
		System.out.println(countZeros(n));
	}

}
