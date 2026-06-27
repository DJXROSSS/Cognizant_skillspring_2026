package Core_Java;

import java.util.Scanner;

public class Q15_StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Reversed: " + new StringBuilder(input).reverse());
    }
}
