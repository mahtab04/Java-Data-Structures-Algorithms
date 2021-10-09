public class ShiftString {
    public static String shift(String s, int n) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int index = (i + n) % s.length();
            str += s.charAt(index);
        }
        return str;

    }

    public static void main(String[] args) {
        String s = "hacker";
        System.out.println(shift(s, 2));

    }

}
