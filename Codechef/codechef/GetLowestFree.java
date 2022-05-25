//https://www.codechef.com/submit-v2/SALE
package codechef;

import java.util.*;
public class GetLowestFree {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int tt = sc.nextInt();
       while (tt-- > 0) {
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();

           //smallest of all the three numbers
           int min = Math.min(a, Math.min(b, c));

           int ans = (a + b + c) - min;
           System.out.println(ans);
       }
       sc.close();
   } 
}
