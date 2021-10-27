//https://leetcode.com/problems/determine-color-of-a-chessboard-square/
package leetcode;

public class ChessBoardColor {

    public static boolean squareIsWhite(String str) {
        if (str.length() != 2)
            return false;
        if ((int) (str.charAt(0)) % 2 != 0 && (int) (str.charAt(1)) % 2 == 0) {
            return true;
        }

        else if ((int) (str.charAt(0)) % 2 == 0 && (int) (str.charAt(1)) % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "c7";
        System.out.println(squareIsWhite(str));
    }
}
