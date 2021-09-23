package arrays;
public class MoveZerosEnd {
    public static void pushZerosAtEnd(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 0, 1, 3, 0, 0 };
        pushZerosAtEnd(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
