package L22; // Package declaration

// Custom exception class to handle specific error scenarios
public class No13Exception extends Exception {
    // Constructor to initialize the exception with a default message
    public No13Exception() {
        super("Error: Value cannot be 13."); // Default error message
    }
}