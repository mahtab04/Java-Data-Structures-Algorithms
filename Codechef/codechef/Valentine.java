package codechef;

//https://www.codechef.com/problems/VALENTINE
import java.util.*;

public class Valentine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans = x / y;

            System.out.println(ans);
        }
        sc.close();
    }
}
