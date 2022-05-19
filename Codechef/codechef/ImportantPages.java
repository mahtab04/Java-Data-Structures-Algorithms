//https://www.codechef.com/problems/CHEFPAGES
package codechef;

import java.util.Scanner;

public class ImportantPages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 1 && b == 1) {
            System.out.println("https://discuss.codechef.com");
        } else if (a == 0) {
            System.out.println("https://www.codechef.com/practice");
        } else if (b == 0) {
            System.out.println("https://www.codechef.com/contests");
        }
        sc.close();
    }
}
