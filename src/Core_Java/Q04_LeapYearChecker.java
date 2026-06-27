package Core_Java;

import java.util.Scanner;

public class Q04_LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean leapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        System.out.println(year + (leapYear ? " is a leap year." : " is not a leap year."));
    }
}
