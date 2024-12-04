package L19;

/**
 * Key Concepts to Learn:
 * 
 * 1. Inheritance: This program demonstrates the use of inheritance by extending the Employee class to create a Manager class, showcasing how to build upon existing classes.
 * 2. Method Overriding: The Manager class overrides the getTotalCompensation method of the Employee class to include the manager's bonus, illustrating how to modify behavior in subclasses.
 * 3. Encapsulation: The Manager class encapsulates the manager's bonus and provides methods to manipulate and access it, highlighting the importance of data hiding and abstraction.
 * 
 * This program defines a Manager class that extends the Employee class, adding a bonus to the manager's compensation and overriding the getTotalCompensation method to include this bonus.
 */

// Manager class extends Employee class
public class Manager extends Employee {
    private double bonus; // Manager's bonus
    // Constructor to initialize a Manager object
    public Manager(String n, double s, double b) {
        super(n,s); // Call the constructor of the superclass
        bonus = b; // Set the bonus of the manager
    }
    // Method to set the bonus of the manager
    public void setBonus(double b) {
        bonus = b; // Set the bonus of the manager
    }
    // Method to return the total compensation of the manager
    // This method overrides the getTotalCompensation method of the superclass
    public double getTotalCompensation() {
        return super.getTotalCompensation() + bonus; // Return the total compensation of the manager
    }
}
