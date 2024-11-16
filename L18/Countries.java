package L18;

import java.util.Arrays; // Import Arrays class for sorting

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
