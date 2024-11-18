package MT;

import java.util.Scanner;

public class NonNegIntArray {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Ask the user how many non-negative integers they want to input
        System.out.println("How many non negative integers would you like to input?");
        // Store the user's input in the 'size' variable
        int size = input.nextInt();
        // Create an array of integers with the size specified by the user
        int[] arr = new int[size];
        // Initialize a counter variable to keep track of the current position in the array
        int i = 0;
        // Loop until all positions in the array have been filled
        while (i < size) {
            // Ask the user to input a negative integer
            System.out.println("Give me negative integer");
            // Store the user's input in the 'num' variable
            int num = input.nextInt();
            // Check if the input number is negative
            if (num < 0) {
                // If the number is negative, store it in the array at the current position
                arr[i] = num;
                // Increment the counter to move to the next position in the array
                i++;
            } else {
                // If the number is not negative, skip to the next iteration of the loop
                continue; // This line is not necessary but is included as per the instructions
            }
        }
    }
}
