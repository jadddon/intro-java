package L20;

public class Cup implements Measurable {
    // Initialize the contents of the cup to 0.0 ounces
    private double contents = 0.0;
    // Define the maximum capacity of the cup in ounces
    private static final double MAXIMUM = 16.0;

    // Method to get the current contents of the cup
    public double getContents() {
        return contents;
    }

    // Method to fill the cup with a specified amount of liquid
    public void fill(double amount) {
        contents += amount; // Add the specified amount to the current contents
        if(contents > MAXIMUM) { // Check if the contents exceed the maximum capacity
            contents = MAXIMUM; // If so, set the contents to the maximum capacity
        }
    }

    // Method to empty the cup by a specified amount of liquid
    public void empty(double amount) {
        contents -= amount; // Subtract the specified amount from the current contents
        if(contents < 0) { // Check if the contents are less than 0
            contents = 0; // If so, set the contents to 0
        }
    }

    // Method to measure the contents of the cup (required by Measurable interface)
    public double measure() {
        return getContents(); // Return the current contents of the cup
    }

    // Method to convert the cup's contents to a string representation
    public String toString() {
        return contents + "ozs"; // Return the contents in ounces as a string
    }
}
