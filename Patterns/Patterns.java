package com.Patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        pattern2(n);
    }

    static void pattern2(int n) {
        /* The first step in every problem related to pattern is
        * Count the total number of lines in the pattern or
        * number of rows in the pattern, because that much time the
        * outer loop will run */

        /* The second step is to identify for every row, how many
        * columns are there or types of element*/

        /* The third step is what do you need to print*/


        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to print a new line.
            System.out.println();
        }
    }
}
