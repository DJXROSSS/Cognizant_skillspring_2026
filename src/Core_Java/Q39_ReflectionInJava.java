package Core_Java;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Q39_ReflectionInJava {
    public static void main(String[] args) throws Exception {
        Class<?> type = Class.forName(Q39_ReflectionInJava.SampleService.class.getName());

        for (Method method : type.getDeclaredMethods()) {
            System.out.print(method.getName() + "(");
            Parameter[] parameters = method.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                System.out.print(parameters[i].getType().getSimpleName());
                if (i < parameters.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }

        Object instance = type.getDeclaredConstructor().newInstance();
        Method greet = type.getDeclaredMethod("greet", String.class);
        System.out.println(greet.invoke(instance, "Reflection"));
    }

    static class SampleService {
        public String greet(String name) {
            return "Hello, " + name;
        }
    }
}
