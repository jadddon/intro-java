package L10;

// Represents a simple counter that can be clicked to increment its count and reset to zero.
public class Counter {
    // Instance variable to store the count
    private int count;

    // Accessor method to get the current count.
    // @return The current count.
    public int getCount() {
        return count;
    }

    // Mutator method to increment the count by one.
    public void click() {
        count++;
    }

    // Mutator method to reset the count to zero.
    public void reset() {
        count = 0;
    }
}
