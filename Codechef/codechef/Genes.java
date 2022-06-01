package codechef;

import java.util.*;

public class Genes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        if (a == 'B' && b == 'B') {
            System.out.println("B");
        }
        if (a == 'R' && b == 'R') {
            System.out.println("R");
        }
        if (a == 'G' && b == 'G') {
            System.out.println("G");
        }
        if (a == 'B' && b == 'R' || a == 'R' && b == 'B') {
            System.out.println("R");
        }
        if (a == 'B' && b == 'G' || a == 'G' && b == 'B') {
            System.out.println("B");
        }
        if (a == 'R' && b == 'G' || a == 'G' && b == 'R') {
            System.out.println("R");
        }

        sc.close();

    }
}
