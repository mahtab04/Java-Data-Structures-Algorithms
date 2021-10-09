public class HighestOccuringChar {
    public static char highestOccuringChar(String str) {
        // //Your code goes here
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);
            count[ascii]++;
        }
        int result = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (count[i] > result) {
                result = count[i];
                index = i;
            }
        }
        return (char) index;

    }

    public static void main(String[] args) {
        String str = "abdefgbabfba";
        char result = highestOccuringChar(str);
        System.out.println(result);
    }
}
