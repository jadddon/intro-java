package L24;

// Key Points to Understand:
// 1. The Towers of Hanoi is a classic problem that involves moving disks from one peg to another.
// 2. The problem is solved recursively, with the base case being when there are no disks to move.
// 3. The recursive function moves the top disk from the 'from' peg to the 'spare' peg, then to the 'to' peg, and finally from the 'spare' peg to the 'to' peg.
// 4. The number of moves is tracked using a static variable 'count'.
// 5. The main method parses the number of disks from the command line arguments and starts the Tower of Hanoi process.

// Towers of Hanoi program
// Command line argument is the number of disks to be moved
public class Tower {
    // Method to move the disks
    public static void tower(char from, char to, char spare, int disk) {
        // Base case: if there are no disks, return
        if (disk > 0) {
            // Move the top disk from 'from' to 'spare'
            tower(from, spare, to, disk - 1);
            // Increment the move count
            count++;
            // Move the top disk from 'from' to 'to'
            System.out.println("Move disk " + disk + " from " + from + " to " + to);
            // Move the top disk from 'spare' to 'to'
            tower(spare, to, from, disk - 1);
        }
    }
    // Static variable to keep track of the number of moves
    static int count = 0;
    // Main method to start the program asd
    public static void main(String[] args) {
        // Get the number of disks from the command line arguments
        int disk = Integer.parseInt(args[0]);
        // Print the initial message
        System.out.println("Towers of Hanoi for " + disk + " disks:");
        // Start the tower of hanoi
        tower('A', 'C', 'B', disk);
        // Print the number of moves
        System.out.println("Number of moves = " + count);
    }
}