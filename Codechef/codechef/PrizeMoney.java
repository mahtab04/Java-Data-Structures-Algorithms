//https://www.codechef.com/MAY222D/problems/PRIZEPOOL
package codechef;

import java.util.*;
public class PrizeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println((x * 10) + (y * 90));
        }
        sc.close();
    }
}
