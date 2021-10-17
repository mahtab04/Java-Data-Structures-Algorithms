//https://leetcode.com/problems/xor-operation-in-an-array/
package leetcode;

public class XorOperation {
    
    public static int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= (start + 2 * i);
        }
        return result;
    
    }
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        System.out.println(xorOperation(n, start));
    }
}
