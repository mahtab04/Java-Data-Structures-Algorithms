package leetcode;

public class ReversePrefix {
    public static String reversePrefix(String str, char ch) {
        if(!str.contains(ch + "")) {
            return str;
        }
        
        
        int n = str.indexOf(ch);
        char[] arr = str.toCharArray();
        int j = n;
        int i=0;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        return new String(arr);

    }
    public static void main(String[] args) {
        String str = "arzquwnjyn";


        char ch = 'j';
        System.out.println(reversePrefix(str, ch));
    }
}
