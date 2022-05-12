package codechef;
import java.util.Scanner;
public class DOMINANT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if (a > b + c) {
                System.out.println("YES");
            }
            else if (b > a + c) {
                System.out.println("YES");
            }
            else if (c > a + b) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
    }
    in.close();
}
}
