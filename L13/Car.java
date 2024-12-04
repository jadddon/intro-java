package L13;

/**
 * Key Concepts to Learn:
 * 
 * 1. Class and Object: This program demonstrates the use of a class and its instance variables to represent a car.
 * 2. Constructor: It showcases how to use a constructor to initialize the car's properties.
 * 3. Accessor and Mutator Methods: The program highlights the use of accessor and mutator methods to get and set the car's properties.
 * 4. Method Overriding: It demonstrates how to override the toString method to provide a string representation of the car.
 * 
 * This program creates a Car class with instance variables for the car's make, model, year, color, and speed. It has a constructor to initialize the car's properties, accessor methods to get the car's properties, mutator methods to change the car's color and speed, and a method to provide a string representation of the car.
 */

public class Car {
    // Instance variables.
    private String make; // Car's make
    private String model; // Car's model
    private int year; // Car's year
    private String color; // Car's color
    private int speed; // Car's speed

    // Constructor to initialize the car's properties
    public Car(String make, String model, int year, String color) {
        this.make = make; // Set the car's make
        this.model = model; // Set the car's model
        this.year = year; // Set the car's year
        this.color = color; // Set the car's color
    }

    // accessor methods
    public String getMake() {
        return make; // Return the car's make
    }
    public String getModel() {
        return model; // Return the car's model
    }
    public int getYear() {
        return year; // Return the car's year
    }
    public String getColor() {
        return color; // Return the car's color
    }
    public int getSpeed() {
        return speed; // Return the car's speed
    }

    // mutator methods
    public void paint(String c) {
        color = c; // Change the car's color
    }
    public void accelerate(int delta) {
        speed += delta; // Increase the car's speed
        if(speed > 120) {
            speed = 120; // Ensure speed does not exceed 120
        }
    }
    public void decelerate(int delta) {
        speed -= delta; // Decrease the car's speed
        if(speed < -30) {
            speed = -30; // Ensure speed does not go below -30
        }
    }

    // overriding the toString method to provide a string representation of the car
    public String toString() {
        return color + " " + year + " " + make + " " + model +
               " " + speed + "mph"; // Format the car's properties into a string
    }
}