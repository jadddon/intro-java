package L8;

import java.util.Scanner; // Importing the Scanner class for user input

public class IsPrime {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner s = new Scanner(System.in);
        
        // Prompt the user to enter a number to check for primality
        System.out.print("Candidate: ");
        
        // Read the user's input and store it in the variable 'a'
        int a = s.nextInt();
        
        // Initialize a boolean variable to assume the number is prime
        boolean isPrime = true;
        
        // Loop to check for factors of 'a' starting from 2
        for(int i=2; i*i<=a; i++) {
            // Check if 'a' is divisible by 'i'
            if(a%i==0) {
                // If divisible, set 'isPrime' to false and exit the loop
                isPrime = false;
                break;
            }
        }
        
        // Print the result based on the value of 'isPrime'
        if(isPrime) {
            System.out.println("It's prime!");
        } else {
            System.out.println("It's NOT prime");
        }
    }
}
