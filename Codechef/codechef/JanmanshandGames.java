//https://www.codechef.com/problems/JGAMES
package codechef;

import java.util.*;

public class JanmanshandGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int res = x + y;
            if (res % 2 == 0) {
                System.out.println("Janmansh");
            } else {
                System.out.println("Jay");
            }
        }
        sc.close();
    }
}
