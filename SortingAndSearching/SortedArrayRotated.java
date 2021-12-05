package searching;

public class SortedArrayRotated {

    public static int sortedArrayRotated(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int prev = (mid + 1) % arr.length;
            int next = (mid + arr.length - 1) % arr.length;
            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return mid;
            }

            if (arr[mid] > arr[prev]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 15, 18, 2, 5, 6, 8, 11 };
        System.out.println(sortedArrayRotated(arr));
    }
}
