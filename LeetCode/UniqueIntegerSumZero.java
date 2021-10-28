package leetcode;

public class UniqueIntegerSumZero {

    public static int[] sumZero(int n) {
        int[] A = new int[n];
        for (int i = 0; i < n; ++i)
            A[i] = i * 2 - n + 1;
        return A;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] result = sumZero(n);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        int n1 = 6;
        int[] result1 = sumZero(n1);
        for (int i : result1) {
            System.out.print(i + " ");
        }
    }

}
