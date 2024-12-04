package L22;

/**
 * Main Conceptual Points to Learn:
 * 
 * 1. Exception handling is crucial in Java to manage runtime errors.
 * 2. Custom exceptions can be created to handle specific error scenarios.
 * 3. The try-catch block is used to catch and handle exceptions.
 * 4. The No13 class demonstrates the use of a custom exception to handle a specific condition.
 * 5. The main method showcases the creation and manipulation of a No13 object, including exception handling.
 */

public class No13Tester {
    public static void main(String[] args) {
        // Initialize No13 object to null
        No13 n = null;
        try {
            // Attempt to create a new No13 object with value 3
            n = new No13(3);
        } catch(No13Exception e) {
            // If an exception occurs, print an error message and exit the program
            System.out.println("Can't recover from this one.");
            System.exit(-1);
        }
        // Print the value of x from the No13 object
        System.out.println(n.getX());
        try {
            // Attempt to set the value of x using the first command line argument
            n.setX( Integer.parseInt(args[0]) );
        } catch(No13Exception e) {
            // If an exception occurs, print an error message
            System.out.println("Nope!");
        }
        // Print the value of x after attempting to set it
        System.out.println(n.getX());
    }
}
