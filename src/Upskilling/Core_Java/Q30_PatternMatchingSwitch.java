package Upskilling.Core_Java;

public class Q30_PatternMatchingSwitch {
    public static void main(String[] args) {
        describe(10);
        describe("Java");
        describe(12.5);
        describe(true);
    }

    public static void describe(Object value) {
        String message = switch (value) {
            case Integer integer -> "Integer value: " + integer;
            case String text -> "String value: " + text;
            case Double number -> "Double value: " + number;
            case Boolean flag -> "Boolean value: " + flag;
            default -> "Unknown type: " + value;
        };

        System.out.println(message);
    }
}
