//https://leetcode.com/problems/count-of-matches-in-tournament/
package leetcode;

public class CountMatches {

    public static int numberOfMatches(int n) {
        int matches = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                matches = matches + n / 2;
                n = n - (n / 2);
            } else {
                matches = matches + (n - 1) / 2;
                n = n - (n - 1) / 2;
            }
        }

        return matches;


        //or simple return n-1;
    }

    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfMatches(n));
        int m = 7;
        System.out.println(numberOfMatches(m));
    }
}
