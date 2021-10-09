public class ReverseEachWord {
    public static String reverseEachWord(String str) {
        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int currentWordEnd = i - 1;
                String reversedWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }
                ans += reversedWord + " ";
                currentWordStart = i + 1;
            }

        }
        for (; i < str.length(); i++) {

            int currentWordEnd = i - 1;
            String reversedWord = "";
            for (int j = currentWordStart; j <= currentWordEnd; j++) {
                reversedWord = str.charAt(j) + reversedWord;
            }
            ans += reversedWord;
        }

        return ans;
    }

    //Reverse each word in a string
    public static String reverseEachWord2(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }
        return sb.toString().trim();
    }

    

    public static void main(String[] args) throws Exception {
        String str = "abc def ghi";
        String result = reverseEachWord(str);
        System.out.println(result);
    }
}
