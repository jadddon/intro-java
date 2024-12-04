package zy9;

import java.util.Objects;
/**
   This class collects a pair of elements of different types.
*/
public class Pair<T, S>
{
   private T first;
   private S second;

   /**
      Constructs a pair containing two given elements.
      @param firstElement the first element
      @param secondElement the second element
   */
   public Pair(T firstElement, S secondElement)
   {
      first = firstElement;
      second = secondElement;
   }

   /**
      Gets the first element of this pair.
      @return the first element
   */
   public T getFirst() { return first; }

   /**
      Gets the second element of this pair.
      @return the second element
   */
   public S getSecond() { return second; }

   public String toString() { return "(" + first + ", " + second + ")"; }
   
   public boolean equals(Object otherObject)
   {      
      if (otherObject instanceof Pair)
      {
         Pair<?, ?> other = (Pair<?, ?>) otherObject;
         return Objects.equals(first, other.first) &&
            Objects.equals(second, other.second);
      }
      else
         return false;
   }
}