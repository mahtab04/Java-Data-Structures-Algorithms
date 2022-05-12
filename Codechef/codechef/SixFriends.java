//https://www.codechef.com/problems/SIXFRIENDS

package codechef;

import java.util.Scanner;

public class SixFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int double_price = input.nextInt();
            int triple_price = input.nextInt();
            int double_result = double_price * 3;
            int triple_result = triple_price * 2;

            if (double_result > triple_result) {
                System.out.println(triple_result);

            } else if (double_result < triple_result) {
                System.out.println(double_result);
            } else if (double_result == triple_result) {
                System.out.println(double_result);
            }

        }
        input.close();
    }
}
