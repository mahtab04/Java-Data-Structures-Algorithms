//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
package leetcode;
import java.util.*;
public class Pangram {

    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkIfPangram(sentence));
    }
}
