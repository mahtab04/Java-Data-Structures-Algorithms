package stack;

import java.util.*;
public class ReverseString {
    public static String revesrseString(String str) {
        Stack<Character> st = new Stack<>();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        while (!st.isEmpty()) {
            res += st.pop();
        }
        return res;
    

    }
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(revesrseString(str));
    
    }
}
