package codechef;
import java.util.Scanner;
public class PARTY2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int f = in.nextInt();//5
            int price = in.nextInt();//10
            int avilable_Money = in.nextInt();//70

            int total_cost = f * price;//50
            if (total_cost <= avilable_Money) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        in.close();
    }
    }
    
