//https://www.codechef.com/submit-v2/FRUITCHAAT
package codechef;

import java.util.*;
public class ChefAndFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int b = sc.nextInt();
            int a = sc.nextInt();
            int b_half = b / 2;

            if (a >= b_half) {
                System.out.println(b_half);
            } else {
                System.out.println(a);
            }
        }
        sc.close();
    }
}
