package L19;

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
