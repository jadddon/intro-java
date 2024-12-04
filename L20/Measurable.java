package L20;

/**
 * Key Concepts to Learn:
 * 
 * 1. Interface Definition: This program defines an interface named Measurable, which specifies a single method measure() that must be implemented by any class that implements it.
 * 
 * This interface is designed to be implemented by classes that need to provide a way to measure or quantify their objects. The measure() method is intended to return a value that represents the measurement of the object.
 */
public interface Measurable {
    // Method to measure the object
    public double measure();
}
