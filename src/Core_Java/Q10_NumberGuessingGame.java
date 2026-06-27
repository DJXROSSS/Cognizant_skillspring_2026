package Core_Java;

import java.util.Random;
import java.util.Scanner;

public class Q10_NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int target = random.nextInt(100) + 1;

        System.out.println("Guess the number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Too low.");
            } else if (guess > target) {
                System.out.println("Too high.");
            } else {
                System.out.println("Correct! The number was " + target + ".");
                break;
            }
        }
    }
}
