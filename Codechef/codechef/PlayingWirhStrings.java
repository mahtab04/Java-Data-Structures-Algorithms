//https://www.codechef.com/submit-v2/PLAYSTR
package codechef;

import java.util.*;

public class PlayingWirhStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = sc.next();
            int count_0_s = 0, count_0_r = 0;
            int count_1_s = 0, count_1_r = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    count_0_s++;

                } else {
                    count_1_s++;

                }

                if (r.charAt(i) == '0') {
                    count_0_r++;
                } else {
                    count_1_r++;
                }
            }

            if (count_0_r == count_0_s && count_1_r == count_1_s) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
