package Z12;

/**
   This class collects a pair of elements of different types.
*/
public class Pair<T, S>
{
   private T first; // The first element of the pair
   private S second; // The second element of the pair

   /**
      Constructs a pair containing two given elements.
      @param firstElement the first element
      @param secondElement the second element
   */
   public Pair(T firstElement, S secondElement)
   {
      first = firstElement; // Assign the first element
      second = secondElement; // Assign the second element
   }

   /**
      Gets the first element of this pair.
      @return the first element
   */
   public T getFirst() { return first; } // Return the first element

   /**
      Gets the second element of this pair.
      @return the second element
   */
   public S getSecond() { return second; } // Return the second element

   /**
      Returns a string representation of the pair.
      @return a string representation of the pair
   */
   public String toString() { return "(" + first + ", " + second + ")"; } // Return a string representation of the pair
}
