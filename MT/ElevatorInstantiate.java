package MT;

public class ElevatorInstantiate {
    public static void main(String[] args) {
        // Create a new Elevator object with a maximum floor of 10
        Elevator e = new Elevator(10);
        // Move the elevator up one floor
        e.upOne();
        // Move the elevator up another floor
        e.upOne();
        // Print the current floor of the elevator
        System.out.println(e.getCurrentFloor());
    }
}