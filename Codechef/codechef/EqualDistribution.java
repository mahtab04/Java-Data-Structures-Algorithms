//https://www.codechef.com/START42D/problems/EQUALDIST
package codechef;

import java.util.*;

public class EqualDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((a + b) % 2 == 0 ? "YES" : "NO");
        }
        sc.close();
    }
}
