package arrays;

public class LeadersInArray {

    public static void leaderprint(int arr[], int n) {

        
        int L = arr[n - 1];
        System.out.print(L + " ");

        // for finding leaders in other elements of the array
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > L) {
                L = arr[i];
                System.out.print(L + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 12, 34, 2, 0, -1 };
        int n = arr.length;

        leaderprint(arr, n);
    }
}

