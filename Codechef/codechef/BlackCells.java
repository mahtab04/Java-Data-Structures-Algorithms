//https://www.codechef.com/problems/BLACKCEL
package codechef;

import java.util.Scanner;

public class BlackCells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = (n * n) / 2;
        System.out.println(ans);
        sc.close();
    }
}
