package arrays;

import java.util.*;

public class SwapAlternate {
	public static void swapAlternate(int arr[]) {
    	
        int j=1;
        for(int i=0;i<(arr.length-1);i=i+2){
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            j=j+2;
        }
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array element: ");
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Before Alternate Swapping: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		swapAlternate(arr);
		System.out.println("After swaping: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
     input.close();
	}

}
