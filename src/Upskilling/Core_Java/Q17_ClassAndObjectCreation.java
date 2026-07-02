package Upskilling.Core_Java;

public class Q17_ClassAndObjectCreation {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2024);
        car.displayDetails();
    }
}

class Car {
    private final String make;
    private final String model;
    private final int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
