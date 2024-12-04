package L13;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming: This program demonstrates the use of classes and objects to represent real-world entities, specifically cars.
 * 2. Array Manipulation: It showcases how to create, initialize, and manipulate an array of objects, including accessing and modifying individual elements.
 * 3. Method Invocation: The program highlights the use of methods to perform actions on objects, such as changing the color of a car or accelerating it.
 * 
 * This program creates a Car class with instance variables for the car's make, model, year, color, and speed. It has a constructor to initialize the car's properties, accessor methods to get the car's properties, mutator methods to change the car's color and speed, and a method to provide a string representation of the car.
 * 
 * The main method demonstrates the creation and manipulation of Car objects, including changing their properties and printing their state.
 */

public class Cars {
    public static void main(String[] args) {
        // Create an instance of Car and print its initial state
        Car oldCar = new Car("Toyota", "Camry", 1999, "tan");
        System.out.println(oldCar);
        
        // Change the car's color and accelerate it twice
        oldCar.paint("red");
        oldCar.accelerate(100);
        oldCar.accelerate(100);
        
        // Print the car's state after modifications
        System.out.println(oldCar);
        
        // Print a separator line for output
        System.out.println("-----");
        
        // Create an array of Cars and initialize it with different cars
        Car[] c = new Car[4];
        c[0] = oldCar;
        c[1] = new Car("Subaru", "Legacy", 2012, "red");
        c[2] = new Car("Tesla", "Model Y", 2022, "blue");
        c[3] = new Car("Honda", "Civic", 2018, "white");
        
        // Print each car in the array
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        
        // Print another separator line for output
        System.out.println("-----");
        
        // Change the color of the last car in the array
        c[3].paint("grey");
        
        // Print each car in the array again to show the change
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}