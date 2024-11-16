package L11;

import java.util.Scanner; // Importing the Scanner class for user input

public class Helper {
    public static boolean isPrime(int value) { // Method to check if a number is prime
        boolean result = true; // Assuming the number is prime initially
        if(value == 2 || value == 3) { // Base cases for prime numbers
            return result; // Return true for 2 and 3
        }
        for(int i=2;i*i<=value;i++) { // Loop to check divisibility
            if(value%i==0) { // If the number is divisible by any i
                result = false; // It's not a prime number
                break; // Exit the loop
            }
        }
        return result; // Return the result
    }

    public static void main(String[] args) { // Main method
        Scanner s = new Scanner(System.in); // Creating a Scanner object
        System.out.print("Number: "); // Prompting the user for a number
        int x = s.nextInt(); // Reading the number
        System.out.println( isPrime(x) ); // Printing the result of isPrime method
    }
}
