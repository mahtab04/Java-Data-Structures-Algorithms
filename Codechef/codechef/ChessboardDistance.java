//https://www.codechef.com/problems/CHESSDIST
package codechef;

import java.util.*;

public class ChessboardDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int ans = Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));
            System.out.println(ans);
        }
        sc.close();
    }
}
