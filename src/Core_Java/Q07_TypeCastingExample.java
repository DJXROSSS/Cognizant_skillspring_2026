package Core_Java;

public class Q07_TypeCastingExample {
    public static void main(String[] args) {
        double decimalValue = 9.99;
        int castToInt = (int) decimalValue;

        int wholeNumber = 25;
        double castToDouble = (double) wholeNumber;

        System.out.println("Double to int: " + castToInt);
        System.out.println("Int to double: " + castToDouble);
    }
}
