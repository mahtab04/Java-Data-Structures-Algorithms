package leetcode;

public class HammingDistance {

    public static int minHammingDistance(int x, int y) {
        int count = 0;
        int xor = x ^ y;
        while (n) {
            count++;
            xor = xor & (xor - 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(minHammingDistance(x, y));
    }
}
