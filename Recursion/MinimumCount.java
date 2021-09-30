package recursion_basics;

public class MinimumCount {

	public static int solveRecursively(int n, int options) {
		if (n <= 0) {
			return 0;
		}
		int min = solveRecursively(n - 1 * 1, options);
		for (int i = 2; i <= options; i++) {
			if (n >= i * i) {
				min = Math.min(min, solveRecursively(n - i * i, options));
			}
		}
		return min + 1;
	}

	public static int minCount(int n) {
		int options = (int) Math.sqrt(n);
		return solveRecursively(n, options);

	}

	public static void main(String[] args) {
		int n = 12;
		System.out.println(minCount(n));
		System.out.println(minCount(9));
	}

}
