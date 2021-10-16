//https://leetcode.com/problems/jewels-and-stones/
package leetcode;
import java.util.*;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            if (map.containsKey(stones.charAt(i))) {
                map.put(stones.charAt(i), map.get(stones.charAt(i)) + 1);
            } else {
                map.put(stones.charAt(i), 1);
            }
        }

        for (int i = 0; i < jewels.length(); i++) {
            if (map.containsKey(jewels.charAt(i))) {
                count += map.get(jewels.charAt(i));
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
