package com.Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        pattern3(n);
    }

    static void pattern3(int n) {
//        Method 1
        for (int row = n; row > 0; row--) {
            for (int col = row; col > 0; col--) {
                System.out.print("$ ");
            }
            System.out.println();
        }
//        Method 2
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n - row + 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
