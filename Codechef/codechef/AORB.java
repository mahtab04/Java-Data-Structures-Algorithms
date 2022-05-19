//https://www.codechef.com/problems/AORB
package codechef;

import java.util.*;

public class AORB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result_a_b = ((500 - (a * 2)) + ((1000 - (b + a) * 4)));

            int result_b_a = ((1000 - (b * 4)) + ((500 - (a + b) * 2)));

            int final_result = Math.max(result_a_b, result_b_a);

            System.out.println(final_result);

        }
        sc.close();
    }
}
