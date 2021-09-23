package arrays;

public class SumTwoArr {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {

        // Your code goes here
        int n = arr1.length - 1;
        int m = arr2.length - 1;
        int c = 0, sum = 0;

        int o = Math.max(arr1.length, arr2.length);

        while (n >= 0 && m >= 0) {
            sum = arr1[n] + arr2[m] + c;
            output[o] = sum % 10;
            c = sum / 10;
            n--;
            m--;
            o--;
        }
        while (n >= 0) {
            sum = arr1[n] + c;
            output[o] = sum % 10;
            c = sum / 10;
            n--;
            o--;
        }
        while (m >= 0) {
            sum = arr2[m] + c;
            output[o] = sum % 10;
            c = sum / 10;
            m--;
            o--;
        }
        output[0] = c;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 6, 9 };
        int arr2[] = { 5, 6, 7, 8, 9, 10 };
        int output[] = new int[12];
        sumOfTwoArrays(arr1, arr2, output);
        for (int x : output) {
            System.out.print(x + " ");
        }

    }
}

