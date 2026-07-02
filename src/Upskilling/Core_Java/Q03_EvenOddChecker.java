package Upskilling.Core_Java;

import java.util.Scanner;

public class Q03_EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println(number % 2 == 0 ? "Even" : "Odd");
    }
}
