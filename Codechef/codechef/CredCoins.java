//https://www.codechef.com/problems/CREDCOINS
package codechef;

import java.util.*;

public class CredCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int totalCoins = x * y;
            int numbrOfBags = totalCoins / 100;
            System.out.println(numbrOfBags);
        }
        sc.close();
    }
}
