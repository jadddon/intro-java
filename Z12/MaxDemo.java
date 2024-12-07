package Z12;

import java.awt.Color;

public class MaxDemo
{
   /**
      This method finds the maximum element in an array of Comparable objects.
      @param a the array of Comparable objects
      @return the maximum element in the array
   */
   public static <E extends Comparable<E>> E max(E[] a)
   {
      // Initialize the largest element with the first element of the array
      E largest = a[0];
      // Iterate through the array starting from the second element
      for (int i = 1; i < a.length; i++)
      {
         // Compare the current element with the largest element found so far
         if (a[i].compareTo(largest) > 0) 
         {
            // If the current element is larger, update the largest element
            largest = a[i];
         }
      }
      // Return the largest element found
      return largest;
   }

   public static void main(String[] args)
   {
      // Define an array of strings
      String[] words = { "Mary", "had", "a", "little", "lamb" };

      // Define an array of Colors (not Comparable, so cannot be used with max method)
      Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW };

      // Define an array of integers
      Integer[] squares = { 1, 4, 9, 16, 25, 36 };

      // Find and print the maximum string in the words array
      System.out.println(max(words)); // Calls max<String>
      // Attempting to find the maximum Color would result in a compile error, so it's commented out
      // System.out.println(max(colors)); // Error: Color is not Comparable
      // Find and print the maximum integer in the squares array
      System.out.println(max(squares)); // Calls max<Integer>
   }
}

