//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
package leetcode;

public class StringAsSubstring {
    public static int numOfString(String[] patterns, String word) {
        int count = 0;
        for(String w:patterns) {
            if(word.contains(w)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] patterns = { "a", "a", "a"};
        String word = "ab";
        System.out.println(numOfString(patterns, word));
    }
    
}
