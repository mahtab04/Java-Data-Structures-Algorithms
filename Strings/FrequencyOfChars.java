public class FrequencyOfChars {
    public static void printFreqChars(String str) {
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.print((char) i + "" + count[i]);

            }
        }
    }

    public static void main(String[] args) {
        String str = "aaabbccdsa";
        printFreqChars(str);
    }
}
