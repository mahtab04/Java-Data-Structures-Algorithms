import java.util.*;

public class FaultyKeyboard {
    public static String removeConsecutiveDup(String str) {

        String result = "";
        str = str + " ";
        for (int i = 0; i < str.length() - 1; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);
            if (ch1 != ch2) {
                result = result + ch1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int n = input.nextInt();
        while (n != 0) {

            String str1 = input.next();

            String str2 = input.next();
            String comp = removeConsecutiveDup(str2);
            System.out.println(str1.equals(comp));
            n--;
        }

        input.close();
    }
}
