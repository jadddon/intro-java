package L10;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming (OOP): This program demonstrates the principles of OOP by creating a CounterTester class, showcasing the use of objects and their methods.
 * 2. Method Invocation: The program highlights the use of methods from the Counter class to manipulate and access the state of counter objects.
 * 
 * This program includes a CounterTester class that tests the functionality of the Counter class by creating instances, clicking to increment the count, resetting the count, and printing the count at different stages.
 */
public class CounterTester {
    public static void main(String[] args) {
        // Create two Counter objects
        Counter c = new Counter();
        Counter c2 = new Counter();
        // Print the initial count of c
        System.out.println( c.getCount() );
        // Click c three times
        c.click();
        c.click();
        c.click();
        // Click c2 once
        c2.click();
        // Get and print the current count of c
        int currentCount = c.getCount();
        System.out.println(currentCount);
        // Reset c
        c.reset();
        // Print the count of c after reset
        System.out.println(c.getCount());
        // Print the count of c2
        System.out.println(c2.getCount());
        // This line is commented out because the count instance variable is private
        //System.out.println( c.count );
    }
}
