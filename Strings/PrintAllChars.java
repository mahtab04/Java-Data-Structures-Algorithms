import java.util.*;

public class PrintAllChars {
    public static void printAllChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        printAllChars(str);
        input.close();

    }
}