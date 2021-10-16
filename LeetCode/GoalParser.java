//https://leetcode.com/problems/goal-parser-interpretation/
package leetcode;

import java.util.*;

public class GoalParser {
    public static String interpret(String command) {
        StringBuilder ans = new StringBuilder(command.length());
        for (int i = 0; i < command.length() - 1; i++) {

            if (command.charAt(i) == 'G') {
                ans.append('G');
            }
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    ans.append('o');
                    i++;
                } else {
                    ans.append("al");
                    i = i + 3;
                }
            }

        }
        return ans.toString();
    }

    public static String interpret2(String command) {
        String ans = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                ans=ans.concat("G");
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    ans=ans.concat("o");
                } else
                    ans=ans.concat("al");
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        String str = "G()()()()(al)";
        System.out.println(interpret2(str));
    }
}
