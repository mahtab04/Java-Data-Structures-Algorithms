package arrays;

public class MaximiseSum {

    public static long maximumSumPath(int[] input1, int[] input2) {
        long maxSum = 0;
        long s1 = 0;
        long s2 = 0;
        int m = input1.length, n = input2.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (input1[i] < input2[j]) {
                s1 += input1[i];
                i++;
            } else if (input1[i] > input2[j]) {
                s2 += input2[j];
                j++;

            } else {
                maxSum += Math.max(s1, s2) + input1[i];
                s1 = 0;
                s2 = 0;
                i++;
                j++;
            }
        }
        while (i < m)
            s1 += input1[i++];

        while (j < n)
            s2 += input2[j++];
        maxSum += Math.max(s1, s2);
        return maxSum;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 5, 10, 15, 20, 25 };
        int input2[] = { 2, 4, 5, 9, 15 };
        System.out.println(maximumSumPath(input1, input2));
    }
}

