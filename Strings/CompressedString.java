public class CompressedString {
    public static String getCompressedString(String str) {
        // Write your code here.
        String s = "";
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);
            count[ascii]++;
        }

        // int index=0;
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                s = s + (char) i;
                if (count[i] > 1) {
                    s = s + count[i];
                }
            }

        }
        return s;
    }

    public static void main(String[] args) {
        String str = "aaabbcddeeeee";
        String result = getCompressedString(str);
        System.out.println(result);
    }
}
