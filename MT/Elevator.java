package MT;

public class Elevator {
    // Initialize the current floor to 1 and declare maxFloor
    private int currentFloor = 1;
    private int maxFloor;
    
    // Constructor to set the maximum floor
    public Elevator(int max) {
        maxFloor = max; // Set the maximum floor
    }
    
    // Method to get the current floor
    public int getCurrentFloor() {
        return currentFloor; // Return the current floor
    }
    
    // Method to move the elevator up one floor
    public void upOne() {
        if(currentFloor < maxFloor) // Check if the current floor is less than the max floor
            currentFloor++; // Move up one floor
    }
    
    // Method to move the elevator down one floor
    public void downOne() {
        if(currentFloor > 1) // Check if the current floor is greater than 1
            currentFloor--; // Move down one floor
    }  
}  

//main takeaways and structure... 
