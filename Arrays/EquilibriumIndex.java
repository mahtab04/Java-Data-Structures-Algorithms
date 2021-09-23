package arrays;

public class EquilibriumIndex {
    public static int arrayEquilibriumIndex(int arr[]) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (rightSum == leftSum) {

                return i;

            }
            leftSum = leftSum + arr[i];
        }
        return -1;
    }
   
    public static void main(String[] args) {
        int arr[] = { 1, 4, 9, 3, 2 };
        System.out.println(arrayEquilibriumIndex(arr));

    }
}

