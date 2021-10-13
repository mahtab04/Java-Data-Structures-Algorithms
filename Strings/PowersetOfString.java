public class PowersetOfString {
    public static void printPowerset(String str,int index,String curr) {
        if(index == str.length()) {
            System.out.println(curr);
            return;
        }
        printPowerset(str, index + 1, curr + str.charAt(index));
        printPowerset(str, index + 1, curr);
    }

    public static void main(String[] args) {
        String str = "abc";//abc,ab,ac,a,b,bc,c ;
        printPowerset(str, 0, "");
        
    }
}
