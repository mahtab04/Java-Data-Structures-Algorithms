
package searching;

public class FirstAndLastOcurrenece {
    public static int firstOccurence(int arr[], int x) {
        int start = 0, end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                result = mid;
                end = mid - 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static int lastOccurence(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                result = mid;
                start = mid + 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 10, 10, 10, 12 };
        int x = 10;
        System.out.println(firstOccurence(arr, x));
        System.out.println(lastOccurence(arr, x));
    }
}
