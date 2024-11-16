package L11; // Package declaration

import java.util.Scanner; // Importing the Scanner class for user input

public class HelperTester { // Class declaration
    public static void main(String[] args) { // Main method
        Scanner s = new Scanner(System.in); // Creating a Scanner object
        System.out.print("Number: "); // Prompting the user for a number
        int x = s.nextInt(); // Reading the number
        System.out.println(Helper.isPrime(x)); // Printing the result of isPrime method
    }
}
