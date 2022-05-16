//https://www.codechef.com/problems/MOVIE2X
package codechef;

import java.util.*;

public class MOVIE2X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int doubleSpeed = (y / 2);
            int ans = (x - y) + doubleSpeed;
            System.out.println(ans);

        }
        sc.close();
    }
}