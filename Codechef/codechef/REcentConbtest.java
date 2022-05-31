//https://www.codechef.com/submit-v2/RECENTCONT
package codechef;

import java.util.*;

public class REcentConbtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int t = sc.nextInt();
            int count_1 = 0, count_2 = 0;
            while (t-- > 0) {

                String s = sc.next();
                if (s.charAt(0) == 'S') {
                    count_1++;
                }
                if (s.charAt(0) == 'L') {
                    count_2++;
                }

            }
            System.out.println(count_1 + " " + count_2);
        }
        sc.close();
    }
}
