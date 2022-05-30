//https://www.codechef.com/submit-v2/ECOCLASS
package codechef;

import java.util.Scanner;

public class EconomicClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int arr_1[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr_1[i] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == arr_1[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
