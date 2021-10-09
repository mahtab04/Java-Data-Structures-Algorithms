public class MinimumLengthWord {
    public static String minLengthWord(String string) {

        String str = string + "";// for extracting last word
        char ch = ' ';
        int length = str.length();
        int count = 0;
        int minimum = length;
        String smallest = "", word = "";
        for (int i = 0; i < length; i++) {
            ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                count = word.length();
                if (count < minimum) {
                    minimum = count;
                    smallest = word;
                }

                word = "";
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        String str = "this is test string";
        System.out.println(minLengthWord(str));
    }
}
