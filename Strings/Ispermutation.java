public class Ispermutation {

    public static boolean isPermutation(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        if (str1.length() == 0 || str2.length() == 0) {
            return true;
        }
        int char1 = 256;
        int[] count = new int[char1];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < char1; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dbac";
        System.out.println(isPermutation(str1, str2));
    }
}
