package Upskilling.Core_Java;

public class Q12_MethodOverloading {
    public static void main(String[] args) {
        System.out.println("add(int, int): " + add(5, 7));
        System.out.println("add(double, double): " + add(3.5, 4.2));
        System.out.println("add(int, int, int): " + add(1, 2, 3));
    }

    public static int add(int first, int second) {
        return first + second;
    }

    public static double add(double first, double second) {
        return first + second;
    }

    public static int add(int first, int second, int third) {
        return first + second + third;
    }
}
