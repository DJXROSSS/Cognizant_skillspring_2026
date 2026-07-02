package Upskilling.Core_Java;

import java.util.Scanner;

public class Q20_TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int second = scanner.nextInt();

        try {
            int result = first / second;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
