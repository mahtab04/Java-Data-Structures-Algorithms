package codechef;

import java.util.Scanner;

public class SUBSCRIBE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int x = in.nextInt();
            if (x <= 30) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        in.close();

    }
}
