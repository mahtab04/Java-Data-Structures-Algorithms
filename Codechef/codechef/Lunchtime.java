//https://www.codechef.com/problems/LTIME

/*
author: @mahtab04
*/
package codechef;

import java.util.Scanner;

public class Lunchtime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int time = input.nextInt();
            if (time > 4) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        input.close();
    }

}
    

