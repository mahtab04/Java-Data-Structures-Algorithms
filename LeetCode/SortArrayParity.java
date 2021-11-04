//https://leetcode.com/problems/sort-array-by-parity/
package leetcode;

public class SortArrayParity {

    public static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int oddIndex = A.length - 1;
        int evenIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[evenIndex] = A[i];
                evenIndex++;
            } else {
                result[oddIndex] = A[i];
                oddIndex--;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = { 3, 1, 2, 4 };
        int[] result = sortArrayByParity(A);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
