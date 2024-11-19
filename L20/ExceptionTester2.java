package L20; // Package declaration

public class ExceptionTester2 {
    
    public static void main(String[] args) {

        String x = "Hello!"; // Assigning a string value to x

        // String x = null; // This line is commented out to avoid NullPointerException

        try{
            System.out.println("Point 1"); // Printing a message before attempting to access the character
            System.out.println(x.charAt(100)); // Attempting to access the character at index 100, which is out of bounds
            System.out.println("Point 2"); // This line will not be reached if an exception is thrown
        } catch(StringIndexOutOfBoundsException e) { // Catching StringIndexOutOfBoundsException
            System.out.println("String out of bounds"); // Printing a message indicating the exception type
            System.out.println(e); // Printing the exception details
        }catch(NullPointerException e) { // Catching NullPointerException
            System.out.println("Null pointer"); // Printing a message indicating the exception type
            System.out.println(e); // Printing the exception details
        }catch(ArrayIndexOutOfBoundsException e) { // Catching ArrayIndexOutOfBoundsException
            System.out.println("Any runtime exception"); // Printing a message indicating the exception type
            System.out.println(e); // Printing the exception details
        }

        System.out.println("And on and on..."); // Printing a message after the try-catch block

}

}
