/**
 * Main Conceptual Points to Learn:
 * 
 * 1. This class is designed to store an integer value.
 * 2. The value can be set and retrieved using the setter and getter methods.
 * 3. The class throws a No13Exception if the value is set to 13.
 */

package L22;

public class No13 {
    private int x; // Private integer variable to store the value

    // Constructor to initialize the object with a value
    public No13(int value) throws No13Exception {
        // Check if the value is 13 and throw an exception if true
        if(value == 13) {
            throw new No13Exception();
        } else {
            // Assign the value to the private variable if it's not 13
            x = value;
        }
    }

    // Getter method to return the value of x
    public int getX() {
        return x;
    }

    // Setter method to change the value of x
    public void setX(int value) throws No13Exception {
        // Check if the value is 13 and throw an exception if true
        if(value == 13) {
            throw new No13Exception();
        } else {
            // Assign the value to the private variable if it's not 13
            x = value;
        }
    }
}