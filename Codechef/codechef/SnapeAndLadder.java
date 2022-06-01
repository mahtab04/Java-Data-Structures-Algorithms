//https://www.codechef.com/submit-v2/SNAPE
package codechef;

import java.util.*;

public class SnapeAndLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(Math.sqrt(b * b - a * a) + " " + Math.sqrt(a * a + b * b));

        }
        sc.close();
    }
}
