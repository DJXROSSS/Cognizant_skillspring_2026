package Upskilling.Core_Java;

import java.util.Scanner;

public class Q21_CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
