//https://www.codechef.com/problems/BIRDFARM
package codechef;

import java.util.*;

public class ChefBirdFarm {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while (t-- > 0) {
           int x = sc.nextInt();
           int y = sc.nextInt();
           int z = sc.nextInt();

           if (z % x == 0 && z % y == 0) {
               System.out.println("ANY");
           } else if (z % x == 0) {
               System.out.println("CHICKEN");
           } else if (z % y == 0) {
               System.out.println("DUCK");

           } else {
               System.out.println("NONE");
           }
       }
         sc.close();
}
}
