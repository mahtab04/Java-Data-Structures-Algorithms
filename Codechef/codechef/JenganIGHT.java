//https://www.codechef.com/problems/JENGA
package codechef;

import java.util.*;

public class JenganIGHT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int x = sc.nextInt();
            if (x % a == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
