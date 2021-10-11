public class AllSubsequences {


    public static String[] subsequenceStrings(String s) {
        //base case
        if (s.length() == 0) {
            String[] result = new String[1];
            result[0] = "";
            return result;
        }
        //recursive case
        String[] smallOutput = subsequenceStrings(s.substring(1));
        String[] result = new String[smallOutput.length * 2];
        for (int i = 0; i < smallOutput.length; i++) {
            result[i] = smallOutput[i];
        }
        for (int i = 0; i < smallOutput.length; i++) {
            result[i + smallOutput.length] = s.charAt(0) + smallOutput[i];
        }
        return result;

    }
    
    

    public static void main(String[] args) {
        String s = "abc";
        String[] result = subsequenceStrings(s);
        for(String str : result) {
            System.out.print(str+" ");
        }
        
    }
}
