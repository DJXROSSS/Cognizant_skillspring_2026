package Upskilling.Core_Java;

public class Q37_JavapBytecode {
    public static void main(String[] args) {
        System.out.println("Compile this class and inspect it with: javap -c Q37_JavapBytecode");
        System.out.println(describe(7));
    }

    public static String describe(int value) {
        int result = value * 2 + 3;
        return "Result: " + result;
    }
}
