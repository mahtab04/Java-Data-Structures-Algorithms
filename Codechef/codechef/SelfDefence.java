//https://www.codechef.com/problems/SELFDEF
package codechef;

import java.util.Scanner;

public class SelfDefence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count = 0;
            int t_a = sc.nextInt();
            while (t_a-- > 0) {
                int x = sc.nextInt();
                if (x >= 10 && x <= 60) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
