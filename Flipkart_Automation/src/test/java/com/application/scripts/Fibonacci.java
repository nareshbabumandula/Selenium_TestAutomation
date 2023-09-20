package com.application.scripts;

public class Fibonacci {
    public static int findTenthFibonacci() {
        int n = 10; // The position of the Fibonacci number you want to find (10th in this case)
        int[] fib = new int[n + 1];

        if (n == 0) {
            return 0;
        }

        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static void main(String[] args) {
        int tenthFibonacci = findTenthFibonacci();
        System.out.println("The 10th Fibonacci number is: " + tenthFibonacci);
    }
}
