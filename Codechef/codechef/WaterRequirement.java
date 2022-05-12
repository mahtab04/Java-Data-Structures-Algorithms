//https://www.codechef.com/problems/WATERREQ
package codechef;

import java.util.Scanner;

public class WaterRequirement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int hour = input.nextInt();
            System.out.println(hour * 2);
        }
        input.close();
    }
}
