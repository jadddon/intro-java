package L15;

import java.util.ArrayList; // Import ArrayList class

/**
 * Key Concepts to Learn:
 * 
 * 1. ArrayList Basics: This program demonstrates the creation, modification, and traversal of an ArrayList in Java.
 * 2. Dynamic Array Operations: The program showcases the dynamic nature of ArrayLists by adding elements.
 * 3. Element Access and Modification: It highlights how to access elements within an ArrayList using their index and enhanced for loop.
 * 
 * This program creates an ArrayList of Integers, adds elements, prints each element using traditional and enhanced for loops.
 */

public class WrapperTester {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> a = new ArrayList<>();
        // Add elements to the ArrayList
        a.add(51);
        a.add(61);
        a.add(7);
        
        // Print each element in the ArrayList using traditional for loop
        for(int i=0;i<a.size();i++) {
            int x = a.get(i);
            System.out.println(x);
        }
        System.out.println("---"); // Separator line for output
        
        // Print each element in the ArrayList using enhanced for loop
        for( int x : a ) {
            System.out.println(x);
        }
    }
}