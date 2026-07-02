//Name - Jatin Kumar Tureha
//Week - 1
//timestamp - 25/06/2026 23:50

package Deepskilling.week_1.engineering_concepts.DesignPatternsAndPrinciples.Exercise_2;

public abstract class DocumentFactory {
    public abstract Document createDocument();
}

/*
Notes

    The Factory Method pattern is a creational design pattern that provides a blueprint for creating objects,
    but allows child classes to alter the type of objects that will be created.
    Instead of calling a constructor directly (using the new keyword) to create an object,
    you call a special method—the "factory" method. This method creates the object for you and returns it.


 */