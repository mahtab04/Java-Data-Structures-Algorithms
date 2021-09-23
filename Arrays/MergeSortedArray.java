package arrays;

public class MergeSortedArray {

    public static int[] mergeSortedArray(int arr1[], int arr2[]) {

        int i = 0, j = 0, k = 0;
        int m = arr1.length, n = arr2.length;
        int arr3[] = new int[m + n];
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < m)
            arr3[k++] = arr1[i++];
        while (j < n)
            arr3[k++] = arr2[j++];

        return arr3;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7, 9 };
        int arr2[] = { 2, 4, 6, 8 };
        int arr3[] = mergeSortedArray(arr1, arr2);
        for (int x : arr3) {
            System.out.print(x);
            System.out.print(" ");
        }

    }
}
