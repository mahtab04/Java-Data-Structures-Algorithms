package arrays;

public class ArrayInverse {
    public static int[] arrayInverse(int arr[]) {
        int inv[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            inv[temp] = i;

        }
        return inv;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 2, 0 };
        int[] inv = arrayInverse(arr);
        for (int x : inv) {
            System.out.print(x + " ");
        }
    }
}
