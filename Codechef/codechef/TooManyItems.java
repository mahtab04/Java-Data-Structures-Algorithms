//https://www.codechef.com/problems/POLYBAGS
package codechef;

import java.util.*;

public class TooManyItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            // if (a % 10 == 0) {
            //     System.out.println(a / 10);
            // } else {
            //     int count = 0;
            //     while (a >= 10) {
            //         int ans = a / 10;
            //         count = count + ans;
            //         a = ans;
            //     }
            //     count++;
            //     System.out.println(count);
            // }
            
            double ans = Math.ceil(a / 10.0);
            int res = (int) ans;
            System.out.println(res);
        }
        sc.close();
    }
}
