//https://www.codechef.com/submit-v2/TODOLIST
package codechef;

import java.util.Scanner;

public class ProblemList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] >= 1000) {
                    count++;
                }
            }

            System.out.println(count);

        }
        sc.close();

    }
}
