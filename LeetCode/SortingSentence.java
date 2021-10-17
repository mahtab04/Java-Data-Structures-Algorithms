package leetcode;

public class SortingSentence {
    public static String sortingSentence(String s) {
        String[] strArr = s.split(" ");
        String[] newArr = new String[strArr.length];

        for (String str : strArr) {
            int i = Integer.parseInt(str.substring(str.length() - 1));
            newArr[i - 1] = str.substring(0, str.length() - 1);
        }

        return String.join(" ", newArr);
    }

    public static void main(String[] args) {
       
        
        System.out.println(sortingSentence("is2 Thi1s T4est 3a"));
    }

    
    }

