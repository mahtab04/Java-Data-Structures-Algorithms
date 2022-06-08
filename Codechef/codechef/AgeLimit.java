//https://www.codechef.com/START42D/problems/AGELIMIT
package codechef;

import java.util.*;

public class AgeLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            int exact = sc.nextInt();

            if (exact >= min && exact <= max) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
