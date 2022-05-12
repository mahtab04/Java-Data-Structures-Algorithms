//https://www.codechef.com/problems/SEMCOURSES
package codechef;

import java.util.Scanner;

public class ChefandChapters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int s = input.nextInt();
            System.out.println(n * k * s);
        }
        input.close();
    }
}
