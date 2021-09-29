package searching;


public class SelectionSort {
    // Bubble sort Function
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < (arr.length - 1); i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;

                }
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // This function prints array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 4, 3, 7, 1 };
        System.out.println("Before sorting: ");
        printArray(arr);
        System.out.println();
        System.out.println("After Sorting: ");
        selectionSort(arr);
        printArray(arr);

    }
}
