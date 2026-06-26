//Name - Jatin Kumar Tureha
//Week - 1
//timestamp - 25/06/2026 23:50

package week_1.engineering_concepts.Exercise_1;

class Logger{
    private static volatile Logger instance; // to counter thread safety issues
    private Logger() {
        System.out.println("Logger initialized!");
    }
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) { //checking thread
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
}

public class SingletonPatternExample {
    static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println("Are both logger instances the same? " + (logger1 == logger2));
    }
}


//Notes
/*
    The Singleton pattern is a creational design pattern that ensures a class has only one instance,
    while providing a global point of access to that instance.

    Think of it like a country’s government. A country can only have one official government at a time.
    No matter where you are in the country, if you need to interact with the government,
    you are dealing with that exact same entity.

    in java there is multithreading so it is possible that multiple threads could try to create an instance of the Singleton class at the same time.
    so we need to use volatile and sunchronized to make sure that it doesn'y happen.

    steps:
    create a private static variable to hold the single instance of the class.
    make the constructor private to prevent instantiation from outside the class.
    provide a public static method that returns the instance of the class.

    we can skep the memory saftey, and just create a more simpler version as well:

    public class SimpleSingleton {
    private static final SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        return instance;
    }
}
*/

