public class RemoveChars {
    public static String removeChars(String str, char ch) {
        if (str.length() == 0) {
            return str;
        }
        String result = "";
        for (int i = 0; i <= (str.length() - 1); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "abbaca";
        char ch = 'b';
        String result = removeChars(str, ch);
        System.out.println(result);
    }
}
