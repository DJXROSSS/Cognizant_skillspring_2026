package Upskilling.Core_Java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q22_FileWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to write to output.txt: ");
        String text = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(text);
            System.out.println("Data has been written to output.txt");
        } catch (IOException exception) {
            System.out.println("Error writing file: " + exception.getMessage());
        }
    }
}
