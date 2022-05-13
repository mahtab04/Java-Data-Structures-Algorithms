//https://www.codechef.com/problems/SUGARCANE
package codechef;

import java.util.Scanner;

public class Sugarcane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int glasses = sc.nextInt();
            int totalCoins = glasses * 50;
            int sugarcaneBuying = totalCoins * 20 / 100;
            int salt_MintLeaves = totalCoins * 20 / 100;
            int shoprent = totalCoins * 30 / 100;

            int total = totalCoins - (sugarcaneBuying + salt_MintLeaves + shoprent);
            System.out.println(total);

        }

        sc.close();
    }
}
