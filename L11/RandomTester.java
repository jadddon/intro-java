package L11;

import java.util.Random; // Importing the Random class for generating random numbers

/**
 * Key Concepts to Learn:
 * 
 * 1. Random Number Generation: This program demonstrates the generation of random numbers using the Math and Random classes, showcasing the use of these classes to generate random numbers.
 * 2. Looping: The program highlights the use of loops to generate and print multiple random numbers.
 * 
 * This program includes a RandomTester class that generates and prints random numbers using the Math and Random classes.
 */
public class RandomTester {
    public static void main(String[] args) {
        // Generating a random double value using Math.random()
        double val = Math.random();
        System.out.println(val);
        System.out.println("-----"); // Separator line for output

        // Creating a Random object for generating random numbers
        Random r = new Random();
        // Loop to generate and print 10 random double values
        for(int i=0;i<10;i++) {
            val = r.nextDouble();
            System.out.println(val);
        }
        System.out.println("-----"); // Separator line for output

        // Loop to generate and print 10 random integer values between 0 and 2
        for(int i=0;i<10;i++) {
            int x = r.nextInt(3);
            System.out.println(x);
        }
    }
}
