package L22;

/**
 * Main Conceptual Points to Learn:
 * 
 * 1. This interface is designed to compare objects of the same type.
 * 2. The compareTo method is used to compare the current object with another object of the same type.
 * 3. The return value of compareTo indicates the order of the objects being compared.
 * 4. Implementing this interface allows objects to be sorted or ordered in a specific way.
 * 5. This interface is essential for creating ordered collections or lists of objects.
 */

public interface ScratchComparable<E> {
    // Method to compare this object with another of the same type
    public int compareTo(E other);
}