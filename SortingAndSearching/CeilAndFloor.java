package searching;

public class CeilAndFloor {
    public static void ceilAndFloor(int arr[], int num) {
        int low = 0, high = arr.length - 1;
        int ceil = 0, floor = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num) {
                ceil = arr[mid];
                floor = arr[mid];
            } else if (arr[mid] > num) {
                high = mid - 1;
                ceil = arr[mid];
            } else {
                low = mid + 1;
                floor = arr[mid];
            } 
        }
        System.out.println(ceil + " " + floor);
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 10, 20, 30, 40, 50 };
        int num = 30;
        ceilAndFloor(arr, num);
    }
}
