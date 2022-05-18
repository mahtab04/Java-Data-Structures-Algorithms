//https://www.codechef.com/problems/CHEFBOTTLE
package codechef;

import java.util.Scanner;

public class ChefandWaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (b > c) {
                System.out.println(0);
            } else {
                int d = c / b;
                if (d > a) {
                    System.out.println(a);
                } else {
                    System.out.println(d);
                }
            }
        }
        sc.close();
    }
}
