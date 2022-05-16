//https://www.codechef.com/problems/POLTHIEF
package codechef;

import java.util.Scanner;

public class PoliceandThief {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int p = input.nextInt();
            int c = input.nextInt();
            if (p < c) {
                p ^= c;
                c ^= p;
                p ^= c;

            }
            System.out.println(p - c);
        }
        input.close();
    }
}
