package L10;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming (OOP): This program demonstrates the principles of OOP by creating a Counter class, showcasing the use of objects and their methods.
 * 2. Encapsulation: The program demonstrates encapsulation by hiding the count within the class and providing methods to manipulate and access it.
 * 
 * This program includes a Counter class that has methods to increment and reset the count of a simple counter.
 */
// Represents a simple counter that can be clicked to increment its count and reset to zero.
public class Counter {
    // Instance variable to store the count
    private int count;

    // Accessor method to get the current count.
    // @return The current count.
    public int getCount() {
        return count;
    }

    // Mutator method to increment the count by one.
    public void click() {
        count++;
    }

    // Mutator method to reset the count to zero.
    public void reset() {
        count = 0;
    }
}
