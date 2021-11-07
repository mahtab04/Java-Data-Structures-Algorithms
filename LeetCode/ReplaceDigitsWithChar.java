//https://leetcode.com/problems/replace-all-digits-with-characters/
package leetcode;

public class ReplaceDigitsWithChar {
    public static String replaceDigitsWithChar(String s) {
        if (s.length() == 0)
            return s;

        char[] ch = s.toCharArray();

        for (int i = 1; i < ch.length; i += 2) {
            ch[i] = (char) (ch[i] - '0' + ch[i - 1]);
        }
        return new String(ch);

    }

    public static void main(String[] args) {
        String s = "a1b1c1";
        System.out.println(replaceDigitsWithChar(s));
    }
}
