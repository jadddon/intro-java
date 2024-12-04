package L21; // Package declaration

/**
 * Key Concepts to Learn:
 * 
 * 1. Exception Handling: This program demonstrates the use of try-catch blocks to handle different types of exceptions that can occur during runtime.
 * 2. NullPointerException: This exception is thrown when a null object reference is used to call a method or access a field.
 * 3. ArrayIndexOutOfBoundsException: This exception is thrown when an array is accessed with an index that is outside the bounds of the array.
 * 4. StringIndexOutOfBoundsException: This exception is thrown when a string is accessed with an index that is outside the bounds of the string.
 * 
 * This program attempts to access an out-of-bounds index in an array and a null string, which triggers the respective exceptions. The catch blocks handle these exceptions and print the exception messages.
 */

// Class declaration
public class ExceptionTester2 {
    // Main method
    public static void main(String[] args) {
        // Initialize a string variable x to null
        String x = null;
        // Declare and initialize an integer array a
        int[] a = { 5, 6, 7, 8};
        try {
            // Print a message indicating the start of the try block
            System.out.println("Point 1");
            // Attempt to access an out-of-bounds index in array a
            a[100] = 45;
            // Attempt to access a character at an out-of-bounds index in string x
            System.out.println(x.charAt(100));
            // Print a message indicating the end of the try block
            System.out.println("Point 2");
        } catch(StringIndexOutOfBoundsException e) {
            // Catch and print any StringIndexOutOfBoundsException
            System.out.println("String out of bounds");
            System.out.println(e);
        } catch(NullPointerException e) {
            // Catch and print any NullPointerException
            System.out.println("Null pointer");
            System.out.println(e);
        } catch(RuntimeException e) {
            // Catch and print any RuntimeException
            System.out.println("Any runtime exception");
            System.out.println(e);
        } catch(Exception e) {
            // Catch and print any Exception
            System.out.println("Any exception at all");
            System.out.println(e);
        }
        // Print a message indicating the end of the program
        System.out.println("And on and on...");
    }
}
