package Upskilling.Core_Java;

import java.util.Scanner;

public class Q13_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }

    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
