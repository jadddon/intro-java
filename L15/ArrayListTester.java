package L15;

import java.util.ArrayList; // Import ArrayList class

public class ArrayListTester {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> a = new ArrayList<>();
        System.out.println("Initial size: " + a.size()); // Print the initial size of the ArrayList
        
        // Add elements to the ArrayList
        a.add("Julie");
        a.add("John");
        a.add("Jenny");
        a.add("Paul");
        System.out.println("Size after adding elements: " + a.size()); // Print the size after adding elements
        
        // Print each element in the ArrayList
        for(int i=0;i<a.size();i++) {
            System.out.println(a.get(i));
        }
        System.out.println("----"); // Separator line for output
        
        // Replace an element in the ArrayList
        a.set(2,"Mary");
        // Print each element in the ArrayList after replacement
        for(int i=0;i<a.size();i++) {
            System.out.println(a.get(i));
        }
        System.out.println("----"); // Separator line for output
        
        // Remove an element from the ArrayList
        a.remove(2);
        // Print each element in the ArrayList after removal
        for(int i=0;i<a.size();i++) {
            System.out.println(a.get(i));
        }
        System.out.println("----"); // Separator line for output
        
        // Insert an element at a specific position in the ArrayList
        a.add(2,"Jenny");
        // Print each element in the ArrayList after insertion
        for(int i=0;i<a.size();i++) {
            System.out.println(a.get(i));
        }
        System.out.println("----"); // Separator line for output
        
        // Print the entire ArrayList
        System.out.println(a);
    }
}
