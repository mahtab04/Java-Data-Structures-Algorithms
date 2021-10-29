//https://leetcode.com/problems/flipping-an-image/
package leetcode;

public class FlippingImage {

    public static int[][] flippingImage(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = arr[i][n - j - 1];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] == 0) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = 0;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] res = flippingImage(arr);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
