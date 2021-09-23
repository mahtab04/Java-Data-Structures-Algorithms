package arrays;

public class CheckArrayRotation {
    public static int arrayRotateCheck(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return (i + 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 1 };
        int n = arrayRotateCheck(arr);
        System.out.println("Rotation Point is at " + n);

    }
}

