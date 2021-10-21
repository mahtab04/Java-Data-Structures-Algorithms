//https://leetcode.com/problems/truncate-sentence/
package leetcode;

public class TurncateSentence {
    public static String truncateSentence(String s, int k) {
        if (s.length() <= k)
            return s;

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {

            sb.append(words[i]);
            sb.append(" ");

        }
        return sb.toString().trim();

    }

    public String truncateSentence2(String s, int k) {
        int idx = 0;
        int spaceCount = 0;

        while (idx < s.length() && spaceCount < k) {
            if (s.charAt(idx) == ' ')
                spaceCount++;
            idx++;
        }
        // if(spaceCount<k) means we have to include whole string
        return spaceCount == k ? s.substring(0, idx - 1) : s;
    }

    public static void main(String[] args) {
        String s = "chopper is not a tanuki";
        int k = 5;
        System.out.println(truncateSentence(s, k));

    }
}
