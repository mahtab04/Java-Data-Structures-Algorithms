public class ReverseStringWordWise {
    public static String reverseStringWordWise(String str) {
        int i = str.length() - 1;
        String ans = "";
        while (i >= 0) {
            while (i >= 0 && str.charAt(i) == ' ')
                i--;
            int j = i;
            if (i < 0)
                break;
            while (i >= 0 && str.charAt(i) != ' ')
                i--;
            if (ans.isEmpty())
                ans = ans.concat(str.substring(i + 1, j + 1));
            else
                ans = ans.concat(" " + str.substring(i + 1, j + 1));
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "Sky is blue";
        System.out.println(reverseStringWordWise(str));
    }
}
