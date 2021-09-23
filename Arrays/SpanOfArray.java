package arrays;


public class SpanOfArray {
    public static int max(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static int min(int[] arr) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int arr[] = { 15, 30, 40, 4, 11, 9 };
        System.out.println(max(arr) - min(arr));
    }
}

