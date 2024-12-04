package L18;

import java.util.Arrays; // Import Arrays class for sorting

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming: This program demonstrates the use of classes and objects to model real-world entities, such as a country.
 * 2. Encapsulation: The Country class encapsulates its data (name, population, and area) and provides methods to manipulate and access it.
 * 3. Comparable Interface: The Country class implements the Comparable interface, allowing for comparison and sorting of Country objects.
 * 4. Arrays: The program uses arrays to manage a collection of Country objects, demonstrating the flexibility of arrays in Java.
 * 
 * This program defines a Countries class that creates instances of Country, compares and prints the results, creates an array of Country objects, prints each country in the array before and after sorting, and sorts the array of countries.
 */

public class Countries {
    public static void main(String[] args) {
        // Create instances of Country
        Country a = new Country("Lebanon", 5300000, 4000);
        Country b = new Country("Germany", 80000000, 140000);
        
        // Compare countries and print the results
        System.out.println(a.compareTo(b)); // Compare a with b
        System.out.println(a.compareTo(a)); // Compare a with itself
        System.out.println(b.compareTo(a)); // Compare b with a
        
        // Create an array of Country objects
        Country[] c = new Country[3];
        c[0] = b; // Assign b to the first position
        c[1] = a; // Assign a to the second position
        c[2] = new Country("Bangladesh", 173000000, 57321); // Create and assign a new Country to the third position
        
        // Print each country in the array before sorting
        for (Country x : c) {
            System.out.println(x);
        }
        System.out.println("-----"); // Separator line for output
        
        // Sort the array of countries
        Arrays.sort(c);
        
        // Print each country in the array after sorting
        for (Country x : c) {
            System.out.println(x);
        }
    }
}
