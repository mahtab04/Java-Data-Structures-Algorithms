//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
package leetcode;

import java.util.*;

public class EqualStringArrays {

    // 1st approach
    public boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {

        String str1 = "";
        String str2 = "";
        str1 = String.join("", arr1);
        str2 = String.join("", arr2);
        return str1.equals(str2);
    }

    // 2nd approach
    public static boolean isEqualStringArray(String[] arr1, String[] arr2) {

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr1.length; i++)
            sb.append(arr1[i]);
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < arr2.length; i++)
            sb1.append(arr2[i]);
        return sb.toString().equals(sb1.toString());
    }

    public static void main(String[] args) {
        String[] arr1 = { "abc", "d", "defg" };
        String[] arr2 = { "abcddefg" };
        System.out.println(isEqualStringArray(arr1, arr2));

    }
}
