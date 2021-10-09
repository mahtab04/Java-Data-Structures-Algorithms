import java.util.*;

public class CountWords {
    public static void countWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {

                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.nextLine();
        countWords(str);
        input.close();
    }
}
