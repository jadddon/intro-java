package L20;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming: This program demonstrates the use of classes and objects to model real-world entities, such as a duck.
 * 2. Encapsulation: The Duck class encapsulates its data (name and weight) and provides methods to manipulate and access it.
 * 3. Interface Implementation: The Duck class implements the Measurable interface, which requires the implementation of a method to measure the weight of the duck.
 * 
 * This program defines a Duck class that can quack and provides methods to get the duck's name and weight, as well as convert the duck's information to a string representation.
 */

public class Duck implements Measurable {
    // Instance variables to hold the duck's name and weight
    private String name;
    private double weight;

    // Constructor to initialize the duck's name and weight
    public Duck(String n, double w) {
        name = n; // Assign the name parameter to the instance variable
        weight = w; // Assign the weight parameter to the instance variable
    }

    // Getter method to return the duck's weight
    public double getWeight() {
        return weight; // Return the duck's weight
    }
    // Getter method to return the duck's name
    public String getName() {
        return name; // Return the duck's name
    }

    // Method to simulate the duck's quacking sound
    public void quack() {
        System.out.println("Quack!"); // Print the quacking sound
    }

    // Method to convert the duck's information to a string representation
    public String toString() {
        return getName() + ": " + getWeight() + "lbs"; // Return a string with the duck's name and weight
    }

    // Method to measure the duck's weight (required by Measurable interface)
    public double measure() {
        return getWeight(); // Return the duck's weight as the measurement
    }
}
