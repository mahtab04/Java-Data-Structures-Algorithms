//https://www.codechef.com/submit-v2/RCBPLAY
package codechef;

import java.util.Scanner;

public class RcbPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int points = z * 2;

            System.out.println((x + points) >= y ? "YES" : "NO");

        }
        sc.close();
    }
}
