import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int low = 0;
        int high = str.length() - 1;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check Palindrome: ");
        String str = input.next();
        boolean result = isPalindrome(str);
        System.out.println(result);
        input.close();
    }
}
