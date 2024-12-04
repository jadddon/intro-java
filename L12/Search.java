package L12;

/**
 * Key Concepts to Learn:
 * 
 * 1. Linear Search: This program demonstrates the implementation of linear search in an array, highlighting a simple yet less efficient search approach.
 * 
 * This program includes a method to perform linear search in an array and a main method to test it with a sample array.
 */

public class Search {
    // Method to perform linear search in an array
    public static int linearSearch(int[] arr, int v) {
        int loc = -1; // Initialize location to -1 indicating not found
        for(int i=0;i<arr.length;i++) { // Loop through the array
            if(arr[i] == v) { // Check if the current element matches the value
                loc = i; // Update location if match found
                return loc; // Return the location immediately
            }
        }
        return loc; // Return -1 if value not found
    }
    // Main method to test the linearSearch method
    public static void main(String[] args) {
        int[] a = { 5, 4, 3, 1, 2, 21, 1, 4, 1 }; // Array to search in
        int m = linearSearch(a,101); // Call linearSearch with the array and value to search
        if(m<0) { // Check if the value was not found
            System.out.println("Value not found"); // Print if value not found
        } else { // If value found
            System.out.println("a[" + m + "] = " + a[m]); // Print the location and value
        }
    }
}
