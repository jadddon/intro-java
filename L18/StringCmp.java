package L18;

import java.util.Arrays; // Import Arrays class for sorting
import java.util.Collections; // Import Collections class for sorting
import java.util.ArrayList; // Import ArrayList class for dynamic array

/**
 * Key Concepts to Learn:
 * 
 * 1. String Comparison: This program demonstrates the use of the compareTo method for comparing strings, highlighting how to determine the lexicographical order of strings.
 * 2. Arrays and ArrayLists: The program showcases the use of both arrays and ArrayLists to manage collections of strings, illustrating the differences and similarities between these data structures.
 * 3. Sorting: The program utilizes the Arrays.sort and Collections.sort methods to sort arrays and ArrayLists of strings, respectively, demonstrating how to arrange strings in lexicographical order.
 * 
 * This program compares strings using the compareTo method, creates and sorts arrays and ArrayLists of strings, and prints the results to the console.
 */

public class StringCmp {
    public static void main(String[] args) {
        // Initialize strings a and b
        String a = "hello";
        String b = "world";
        
        // Compare strings and print the results
        System.out.println( a.compareTo(b) ); // Compare a with b
        System.out.println( a.compareTo("hello") ); // Compare a with itself
        System.out.println( b.compareTo(a) ); // Compare b with a
        
        // Create an array of strings
        String[] stuff = new String[4];
        stuff[0] = b; // Assign b to the first position
        stuff[1] = a; // Assign a to the second position
        stuff[2] = "mundo"; // Assign "mundo" to the third position
        stuff[3] = "hola"; // Assign "hola" to the fourth position
        
        // Print each string in the array before sorting
        for(String s : stuff) {
            System.out.println(s);
        }
        System.out.println("------"); // Separator line for output
        
        // Sort the array of strings
        Arrays.sort(stuff);
        
        // Print each string in the array after sorting
        for(String s : stuff) {
            System.out.println(s);
        }
        System.out.println("------"); // Separator line for output
        
        // Create an ArrayList of strings
        ArrayList<String> stuff2 = new ArrayList<>();
        stuff2.add(b); // Add b to the ArrayList
        stuff2.add(a); // Add a to the ArrayList
        stuff2.add("mundo"); // Add "mundo" to the ArrayList
        stuff2.add("hola"); // Add "hola" to the ArrayList
        
        // Print each string in the ArrayList before sorting
        for(String s : stuff2) {
            System.out.println(s);
        }
        System.out.println("------"); // Separator line for output
        
        // Sort the ArrayList of strings
        Collections.sort(stuff2);
        
        // Print each string in the ArrayList after sorting
        for(String s : stuff2) {
            System.out.println(s);
        }
        System.out.println("------"); // Separator line for output
    }
}
