package L9;

import java.awt.Rectangle; // Importing the Rectangle class from java.awt

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming (OOP): This program demonstrates the principles of OOP by creating a RecTest class, showcasing the use of objects and their methods.
 * 2. Method Invocation: The program highlights the use of methods from the Rectangle class to manipulate and access the state of rectangle objects.
 * 
 * This program includes a RecTest class that tests the functionality of the Rectangle class by creating instances, translating rectangles, and printing their coordinates and dimensions at different stages.
 */
public class RecTest {
    public static void main(String[] args) {
        // Creating a new Rectangle object 'a' with specified coordinates and dimensions
        Rectangle a = new Rectangle(10, 10, 100, 1000);
        // Creating a new Rectangle object 'b'
        Rectangle b;
        b = new Rectangle(1, 1, 10, 10); // Setting 'b' to a new Rectangle with specified coordinates and dimensions
        
        // Printing the initial coordinates of 'a'
        System.out.println(a.getX() + "," + a.getY());
        // Printing the dimensions of 'a'
        System.out.println(a.getWidth() + "," + a.getHeight());
        
        // Translating 'a' by 5 units in the x-axis and 20 units in the y-axis
        a.translate(5, 20);
        // Printing the new coordinates of 'a' after translation
        System.out.println(a.getX() + "," + a.getY());
        
        // Creating a new Rectangle object 'c' and setting it to 'b'
        Rectangle c = b;
        // Printing the coordinates of 'c'
        System.out.println("c's coordinates: " + c.getX() + " " + c.getY());
        // Printing the dimensions of 'c'
        System.out.println("c's dimensions: " + c.getWidth() + " " + c.getHeight());
        
        // Translating 'b' by 5 units in the x-axis and 6 units in the y-axis
        b.translate(5, 6);
        // Printing the coordinates of 'c' after 'b' has been translated
        System.out.println("c's coordinates: " + c.getX() + " " + c.getY());
        
        // Initializing integer variables 'x' and 'y'
        int x = 5;
        int y = x; // Setting 'y' to the value of 'x'
        // Printing the initial values of 'x' and 'y'
        System.out.println("x: " + x + " y: " + y);
        
        // Updating the value of 'x'
        x = 6;
        // Printing the updated value of 'x' and the value of 'y'
        System.out.println("x: " + x + " y: " + y);
    }
}
