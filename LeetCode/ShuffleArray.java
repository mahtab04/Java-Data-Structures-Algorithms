//https://leetcode.com/problems/shuffle-the-array/
package leetcode;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int k = 0;
        for(int i=0,j=n;i<n;i++,j++,k+=2){
            ans[k] = nums[i];
            ans[k+1] = nums[j];
    
    }
    return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        //ShuffleArray s = new ShuffleArray();
        int[] ans = new int[arr.length];
        ans = shuffle(arr, n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    
}
        
    
}
