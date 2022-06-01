package codechef;

import java.util.*;

public class BottomFace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int a = sc.nextInt();
            int result = Math.abs(a - 7);
            System.out.println(result);
        }
        sc.close();

    }
}
