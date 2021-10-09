// i/p="aaabbccdeefa";
// o/p = a3b2c2de2fa
public class CompressedStirng2 {
    public static String compressedString_1(String str) {
        char r = str.charAt(0);
        String result = "";
        result += r;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr != prev) {
                result += curr;
            }
        }
        return result;
    }

    public static String compressedString_2(String str) {
        char r = str.charAt(0);
        String result = "";
        result += r;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    result += count;
                    count = 1;
                }
                result += curr;
            }

        }
        if (count > 1) {
            result += count;
            count = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "aaabbccdeefa";

        System.out.println(compressedString_2(str));
    }
}
