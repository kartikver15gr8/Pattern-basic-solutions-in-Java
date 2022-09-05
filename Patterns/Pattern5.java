package com.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 9;
        pattern5(n);
    }

    static void pattern5(int n) {
        int spaces = n / 2;
        for (int row = 1; row <= n; row++) {
            if (row <= (n/2)+1) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int col = 1; col <= n - row + 1; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
