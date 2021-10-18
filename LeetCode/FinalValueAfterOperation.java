//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
package leetcode;

public class FinalValueAfterOperation {
    public static int finalValueAfterOperation(String[] operations) {
        int x = 0;
        for (String str : operations) {
            if (str.charAt(0) == '+' || str.charAt(str.length() - 1) == '+') {
                
                x++;
            } else {
                
                x--;
            }
        }
        return x;
        }
    
    public static void main(String[] args) {
        String str[] = { "++X", "++X", "X++"};
        System.out.println(finalValueAfterOperation(str));
    }
}
