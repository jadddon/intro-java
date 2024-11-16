package L15;

import java.util.ArrayList; // Import ArrayList class

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