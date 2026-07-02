package Upskilling.Core_Java;

import java.util.Arrays;
import java.util.List;

public class Q29_Records {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 20),
                new Person("Bob", 16),
                new Person("Carol", 25)
        );

        System.out.println("All people: " + people);
        System.out.println("Adults: " + people.stream().filter(person -> person.age() >= 18).toList());
    }
}

record Person(String name, int age) {
}
