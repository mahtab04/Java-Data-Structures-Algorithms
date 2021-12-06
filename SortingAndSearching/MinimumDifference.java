
//i/p = [1,2,8,10,15];
//key = 12
//o/p = 2   abs(12-1)=11  abs(12-2)=10  abs(12-8)=4  abs(12-10)=2  abs(12-15)=3
//least diff = 2

package searching;

public class MinimumDifference {

    public static int minDifference(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return arr[mid];
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        int diff1 = Math.abs(arr[start] - key);
        int diff2 = Math.abs(arr[end] - key);
        if (diff1 < diff2) {

            return arr[start];
        } else {
            return arr[end];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 10, 15 };
        int key = 12;
        System.out.println(minDifference(arr, key));
    }
}
