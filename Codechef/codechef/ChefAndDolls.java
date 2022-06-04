//https://www.codechef.com/submit-v2/MISSP
package codechef;

import java.util.*;


public class ChefAndDolls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            int ans = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            for (int i = 0; i < n; i++) {
                ans = ans ^ arr[i];

            }
            System.out.println(ans);

        }
        sc.close();
    }
}