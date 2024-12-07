package Z12;

public class PairDemo
{
   public static void main(String[] args)
   {
      // Define an array of names
      String[] names = { "Tom", "Diana", "Harry" };
      // Call the firstContaining method to find the first name containing "a" and its index
      Pair<String, Integer> result = firstContaining(names, "a");
      // Print the first element of the result pair, which is the name containing "a"
      System.out.println(result.getFirst());
      // Expected output: Diana
      System.out.println("Expected: Diana");
      // Print the second element of the result pair, which is the index of the name containing "a"
      System.out.println(result.getSecond());
      // Expected output: 1
      System.out.println("Expected: 1");
   }

   /**
      This method finds the first string in an array that contains a given substring, 
      and returns a pair containing the string and its index in the array. If no 
      string contains the substring, it returns a pair with null and -1.
      @param strings an array of strings to search in
      @param sub the substring to search for
      @return a pair (strings[i], i) where strings[i] is the first string containing sub, 
      or a pair (null, -1) if there is no match
   */
   public static Pair<String, Integer> firstContaining(
      String[] strings, String sub)
   {
      // Iterate over the array of strings
      for (int i = 0; i < strings.length; i++)
      {
         // Check if the current string contains the given substring
         if (strings[i].contains(sub))
         {
            // If it does, return a pair containing the string and its index
            return new Pair<>(strings[i], i);
         }
      }
      // If no string contains the substring, return a pair with null and -1
      return new Pair<>(null, -1);
   }
}

