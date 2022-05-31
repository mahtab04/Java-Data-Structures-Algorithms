//https://www.codechef.com/submit-v2/WORDLE
package codechef;

import java.util.*;
public class Codeial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            String s = sc.next();
            String t = sc.next();

            String ans = "";

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == t.charAt(i)) {
                    ans += 'G';
                } else {
                    ans += 'B';
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
