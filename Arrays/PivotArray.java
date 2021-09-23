package arrays;

public class PivotArray {
    // find Pivot of an array
    public static int pivot(int[] arr, int start, int end) {

        int mid = (start + end) / 2;
        if (arr[mid] > arr[mid + 1]) {
            return mid;
        } else {
            if (arr[start] > arr[mid]) {
                return pivot(arr, start, mid - 1);
            } else {
                return pivot(arr, mid + 1, end);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 0, 1, 2, 3 };

        int pivot = pivot(arr, 0, arr.length - 1);
        System.out.println(pivot);
    }
}

