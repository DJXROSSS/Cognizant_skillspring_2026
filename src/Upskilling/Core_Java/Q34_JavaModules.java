package Upskilling.Core_Java;

public class Q34_JavaModules {
    public static void main(String[] args) {
        System.out.println("module com.utils { exports com.utils; }");
        System.out.println("module com.greetings { requires com.utils; }");
        System.out.println(Utils.greet("Java modules"));
    }

    static class Utils {
        static String greet(String value) {
            return "Hello from com.utils, " + value;
        }
    }
}
