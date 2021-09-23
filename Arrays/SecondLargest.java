package arrays;


public class SecondLargest {
    public static int secondLargestElement(int[] arr) {

        int min = Integer.MIN_VALUE;
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        if (arr.length < 2)
            return min;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == min)
            return min;
        else
            return second;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 3, 6, 7, 2, 3, 5, 7 };
        int result = secondLargestElement(arr);
        System.out.println(result);
    }
}

