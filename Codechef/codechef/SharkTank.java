//https://www.codechef.com/problems/SST
package codechef;

import java.util.*;

public class SharkTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int aInvestiment = (a * 100) / 10;
            int bInvestiment = (b * 100) / 20;
            if (aInvestiment > bInvestiment) {
                System.out.println("FIRST");
            } else if (aInvestiment < bInvestiment) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }
        sc.close();
    }
}
