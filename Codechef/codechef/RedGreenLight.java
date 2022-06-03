//https://www.codechef.com/submit-v2/DOLL
package codechef;

import java.util.*;

public class RedGreenLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int count = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > a) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
