//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
package leetcode;

import java.util.*;

public class MinimumNumberOfMoves {

    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(students);
        Arrays.sort(seats);
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            count += Math.abs(students[i] - seats[i]);

        }
        return count;
    }

    public static void main(String[] args) {
        int[] seats = { 2, 7, 4 };
        int[] students = { 3, 1, 5 };
        System.out.println(minMovesToSeat(seats, students));

    }

}
