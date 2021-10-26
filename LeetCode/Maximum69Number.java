//https://leetcode.com/problems/maximum-69-number/
package leetcode;

import java.util.*;

public class Maximum69Number {

    public static int maximum69Number(int num) {
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        int max = num;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '6') {
                StringBuilder sb2 = new StringBuilder(Integer.toString(num));
                sb2.setCharAt(i, '9');
                max = Math.max(max, Integer.parseInt(sb2.toString()));
            } else {
                StringBuilder sb2 = new StringBuilder(Integer.toString(num));
                sb2.setCharAt(i, '6');
                max = Math.max(max, Integer.parseInt(sb2.toString()));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 9996;
        System.out.println(maximum69Number(n));

    }
}
