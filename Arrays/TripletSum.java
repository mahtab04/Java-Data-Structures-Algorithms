package arrays;

//i/p
//7
//1 2 3 4 5 6 7 
//19
//o/p=0

//i/p
//9
//2 -5 8 -6 0 5 10 11 -3
//10
//o/p
//5
import java.util.*;

public class TripletSum {
 // This function returns tripletsum count in an array;
 public static int findTriplet(int[] arr, int x) {

     int count = 0;
     for (int i = 0; i < (arr.length); i++) {
         for (int j = i + 1; j < (arr.length); j++) {
             for (int k = j + 1; k < (arr.length); k++) {
                 if ((arr[i] + arr[j] + arr[k]) == x)
                     count++;
             }
         }
     }
     return count;
 }

 // Efficint solution
 public static int findTripletEfficint(int[] arr, int x) {

     int count = 0;
     Arrays.sort(arr);
     for (int i = 0; i < (arr.length - 2); i++) {
         int j = i + 1;
         int k = arr.length - 1;
         while (j < k) {
             if (arr[i] + arr[j] + arr[k] == x) {
                 count++;
                 j++;
                 k--;
             } else if (arr[i] + arr[j] + arr[k] < x) {
                 j++;
             } else {
                 k--;
             }
         }
     }
     return count;
 }

 public static void main(String[] args) {
     int arr[] = { 6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0 };
     int sum = 5;
     int result = findTripletEfficint(arr, sum);
     System.out.println(result);
 }
}

