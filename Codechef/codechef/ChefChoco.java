//https://www.codechef.com/problems/CHEFCHOCO
package codechef;

import java.util.*;

public class ChefChoco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int ans = (c - x) * y;
            System.out.println(ans);
        }
        sc.close();
    }
}
