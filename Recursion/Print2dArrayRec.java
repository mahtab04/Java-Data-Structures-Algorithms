
package recursion_basics;
//sample input

// 3 3
// 1    2    3
// 4    5    6
// 7    8    9
//sample output
// 1 2 3
// 1 2 3
// 1 2 3
// 4 5 6
// 4 5 6
// 7 8 9
public class Print2dArrayRec {

	public static void print2dArray(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		for (int i = 0; i < row; i++) {
			for (int k = i; k < row; k++) {
				for (int j = 0; j < col; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		print2dArray(arr);
	}

}
