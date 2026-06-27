package Core_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q25_HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> students = new HashMap<>();

        System.out.print("How many entries do you want to add? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            students.put(id, name);
        }

        System.out.print("Enter an ID to retrieve: ");
        int searchId = scanner.nextInt();
        System.out.println("Name: " + students.getOrDefault(searchId, "Not found"));
    }
}
