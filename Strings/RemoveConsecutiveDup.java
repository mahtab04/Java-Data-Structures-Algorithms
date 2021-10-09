public class RemoveConsecutiveDup {
    // faulty keyboard

    // public static String removeConsecutiveDup(String str) {
    // // int len = str.length();
    // String result = "";
    // str = str + " ";
    // for (int i = 0; i < str.length() - 1; i++) {
    // char ch1 = str.charAt(i);
    // char ch2 = str.charAt(i + 1);
    // if (ch1 != ch2) {
    // result = result + ch1;
    // }
    // }
    // return result;
    // }
    public static StringBuilder removeConsecutiveDup(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        String str = "aaaaaaa";
        StringBuilder result = removeConsecutiveDup(str);
        System.out.println(result);

    }
}
