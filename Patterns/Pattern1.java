package com.Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
