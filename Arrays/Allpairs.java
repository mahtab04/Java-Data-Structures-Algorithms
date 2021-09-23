package arrays;

import java.util.*;
public class Allpairs {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Array size: ");
	int n = input.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter the array element: ");
	for(int i=0;i<n;i++) {
		arr[i] = input.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			System.out.println("("+arr[i]+","+arr[j]+")");
		}
	}
	input.close();
}
}

